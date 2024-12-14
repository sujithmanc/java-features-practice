package tech.sujith.features.oops_concepts;

class SharedData {
	private volatile boolean flag = false; // Shared variable accessed by multiple threads

	public void changeFlag() {
		flag = true; // Thread 1 sets flag to true
	}

	public boolean isFlagSet() {
		return flag; // Thread 2 checks the value of flag
	}
}

public class Basic__002 {
	public static void main(String[] args) {
		final SharedData sharedData = new SharedData();

		// Thread 1 - Changes the flag
		new Thread(() -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sharedData.changeFlag();
			
			System.out.println("Flag changed by Thread 1");
		}).start();

		// Thread 2 - Checks the flag
		new Thread(() -> {
			while (!sharedData.isFlagSet()) {
				// Busy waiting until flag becomes true
			}
			System.out.println("Flag is true now, Thread 2 can proceed");
		}).start();
	}
}
