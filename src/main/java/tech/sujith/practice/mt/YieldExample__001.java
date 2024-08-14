package tech.sujith.practice.mt;

public class YieldExample__001 {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(name + " executing iteration " + i);
                // Check if i is even, yield to give the other thread a chance to run
                try {
					Thread.sleep(1_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                
                if (i % 7 == 0) {
                    Thread.yield(); // Yield control to other threads
                }
            }
        }
    }
}

