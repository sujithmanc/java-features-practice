package tech.sujith.features.mutli_threading.future;

import java.util.concurrent.CompletableFuture;

public class GetVsJoinExample {
	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000); // Simulating a time-consuming task
				return 42;
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		// Using join()
		System.out.println("\nUsing join():");
		int result = future.join(); // Does not throw checked exceptions
		System.out.println("Result obtained using join(): " + result);

		// Using get()
		try {
			System.out.println("Using get():");
			int result2 = future.get(); // Blocks until the future completes
			System.out.println("Result obtained using get(): " + result2);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}

	}
}
