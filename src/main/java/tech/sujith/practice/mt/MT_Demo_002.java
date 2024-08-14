package tech.sujith.practice.mt;

public class MT_Demo_002 {
	public static void main(String[] args) throws InterruptedException {
		
		
		T2 t = new T2("Sujith Manchala");
		t.start(); // Start the child thread first

		Thread.sleep(5000);

		synchronized (t) { // Synchronize the main thread on the instance of T
			System.out.println("MAIN thread got the LOCK on "+ t);
			Thread.sleep(1000);
			System.out.println("MAIN thread trying to call WAIT method");
			Thread.sleep(1000);
			System.out.println("MAIN thread entered into WAITING state(PAUSED)");
			t.wait(10_000); // Wait for 1 second for the child thread to finish
			Thread.sleep(1000);
			System.out.println("MAIN thread GOT notification(RESUMED)");
		}

		System.out.println("MAIN thread: " + t.getValue());
		System.out.println("MAIN thread Dead");
	}
}

class T2 extends Thread {
	
	
	
	long value = 0;

	
	
	public T2(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (this) {

			try {
				//Thread.sleep(1000);
				System.out.println("CHILD thread got the LOCK on" + this);
				//Thread.sleep(1000);
				System.out.println("CHILD thread STARTED calculations");
				for (int i = 1; i <= 2000; i++) {
					//Thread.sleep(1);
					value += i;
				}
				System.out.println("CHILD thread trying to give notification");
				//Thread.sleep(1000);
				this.notify(); // Notify the waiting thread (main thread)
				//Thread.sleep(1000);
				System.out.println("CHILD thread after gave notification");
				//Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		System.out.println("CHILD thread Dead");
	}

	public long getValue() {
		return value;
	}
}
