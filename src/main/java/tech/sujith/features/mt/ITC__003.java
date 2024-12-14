package tech.sujith.features.mt;

import java.util.LinkedList;
import java.util.Queue;

public class ITC__003 {
	public static void main(String[] args) throws InterruptedException {

		final Queue<Integer> queue = new LinkedList<>();

		Runnable pro = () -> {
			synchronized (queue) {
				try {
					System.out.println(Thread.currentThread().getName() + " got the lock");
					if (!queue.isEmpty()) {
						System.out.println(Thread.currentThread().getName() + " waiting to for EMPTY QUEUE notification");
						queue.wait();
						System.out.println(Thread.currentThread().getName() + " Got Notification!");
					}
					queue.offer(1234);
					System.out.println(Thread.currentThread().getName() + " Wrote the data");
					queue.notify();
					System.out.println(Thread.currentThread().getName() + " Gave the notification");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable cons = () -> {
			synchronized (queue) {
				System.out.println(Thread.currentThread().getName() + " Got the lock");
				if (queue.isEmpty()) {
					try {
						System.out.println(Thread.currentThread().getName() + " waiting for producer to write data!");
						queue.wait();
						System.out.println(Thread.currentThread().getName() + " Got Notification!");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				queue.clear();

				System.out.println(Thread.currentThread().getName() + " Empty the value");
				queue.notify();
				System.out.println(Thread.currentThread().getName() + " Gave the notification");
			}
		};

		Thread t1 = new Thread(pro, "Producer");
		Thread t2 = new Thread(cons, "Consumer");

		// Start the threads
		
		t1.start();
		t2.start();
		
		// Wait for the threads to finish
		t1.join();
		t2.join();
		System.out.println("SUCCESS");
	}
}
