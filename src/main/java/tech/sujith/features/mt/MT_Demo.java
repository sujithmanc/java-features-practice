package tech.sujith.features.mt;

import java.util.Random;

public class MT_Demo {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		T t = new T();
		

		Thread.sleep(10000); // Not recommended
		// t.join(); // Main thread enter into waiting state, until child thread over.
		// In expecting update senario, it was not recommaned.
		// Joined thread has to wait until the child has completed even after the output
		// is ready. Unnessarily waiting to complete all the method.

		// t.wait(); java.lang.IllegalMonitorStateException: current thread is not owner

		synchronized (t) {
			t.start();
			System.out.println("MAIN thread got the LOCK");
			System.out.println("MAIN thread trying to call WAIT method");
			System.out.println("MAIN thread entered into WAITING state(PAUSED)");
			t.wait(1);
			System.out.println("MAIN thread GOT notification(RESUMED)");
		}

		System.out.println("MAIN thread: " + t.getValue()); // Main: Expecting an updating.
		System.out.println("MAIN thread Dead");
	}
}

class T extends Thread {

	long value = 0;

	@Override
	public void run() {

		synchronized (this) {
			System.out.println("CHILD thread got the LOCK");
			System.out.println("CHILD thread STARTED calculations");
			for (int i = 1; i <= 2000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				value += i;
			}
			System.out.println("CHILD thread trying to give notification");
			this.notify(); // java.lang.IllegalMonitorStateException: current thread is not owner
			System.out.println("CHILD thread after gaven notification");
		}
		System.out.println("CHILD thread Dead");
	}

	public long getValue() {
		return value;
	}

}