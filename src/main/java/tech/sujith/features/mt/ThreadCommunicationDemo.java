package tech.sujith.features.mt;

public class ThreadCommunicationDemo {
	private static final Object lock = new Object(); // Shared lock object

	public static void main(String[] args) {
		WorkerThread worker = new WorkerThread();
		worker.start(); // Start the worker thread first

		// Sleep to ensure the worker thread starts first
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (lock) {
			try {
				System.out.println("Main thread waiting...");
				lock.wait(); // Main thread waits for notification
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread resumed...");
			System.out.println("Result from worker thread: " + worker.getResult());
		}
	}

	static class WorkerThread extends Thread {
		private long result = 0;

		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("Worker thread started...");
				// Perform some computation
				for (int i = 1; i <= 2000; i++) {
					result += i;
				}
				System.out.println("Worker thread completed...");
				lock.notify(); // Notify waiting thread
			}
		}

		public long getResult() {
			return result;
		}
	}
}
