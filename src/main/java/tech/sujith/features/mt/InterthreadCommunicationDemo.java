package tech.sujith.features.mt;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class InterthreadCommunicationDemo {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1); // Queue with capacity 1
		Random r = new Random();
		
		Thread producerThread = new Thread(() -> {
			try {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Producer producing: " + i);
					queue.put(i); // Put the item into the queue
					Thread.sleep(r.nextInt(500, 1000)); // Simulate some work
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumerThread = new Thread(() -> {
			try {
				for (int i = 1; i <= 10; i++) {
					int item = queue.take(); // Take an item from the queue (blocks if empty)
					System.out.println("Consumer consuming: " + item);
					Thread.sleep(r.nextInt(500, 1000));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();

		producerThread.join();
		consumerThread.join();
		System.out.println("SUCCESS!!");
	}
}
