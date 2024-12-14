package tech.sujith.practice.concorrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tech.sujith.utils.Util;

public class Concorrent__001 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(8);

		Future<Long> submit = pool.submit(() -> {
			System.out.println("Task 1 started");
			Util.sleep(1000 * 4);
			System.out.println("Sub thread finished.");
			return 10L;
		});

		Future<Long> submit2 = pool.submit(() -> {
			System.out.println("Task 2 started");
			Util.sleep(1000 * 4);
			System.out.println("Sub thread finished.");
			return 10L;
		});

		Future<Long> submit3 = pool.submit(() -> {
			System.out.println("Task 3 started");
			Util.sleep(1000 * 4);
			System.out.println("Sub thread finished.");
			return 10L;
		});

		Future<Long> submit4 = pool.submit(() -> {
			System.out.println("Task 4 started");
			Util.sleep(1000 * 4);
			System.out.println("Sub thread finished.");
			return 10L;
		});
		
		

		
		System.out.println("Before get");
		Long long1 = submit.get(); // awaiting to get complete the future task.
		System.out.println("Before get");
		Long long2 = submit2.get(); // awaiting to get complete the future task.
		System.out.println("Before get");
		Long long3 = submit3.get(); // awiting to get complete the future task.
		System.out.println("Before get");
		Long long4 = submit4.get(); // awaiting to get complete the future task.

		System.out.println("After get");

		System.out.println("Main thread finished." + long1);

	}
}
