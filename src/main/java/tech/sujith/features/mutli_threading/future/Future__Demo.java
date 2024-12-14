package tech.sujith.features.mutli_threading.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Future__Demo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("Inside int completable future:");
			delay(5000);
			return "Hello1";
		});

		System.out.println("Main Thread");
		delay(1000);
		System.out.println("Waiting to get completed:)");
		Void join = completableFuture.thenAcceptAsync(s -> System.out.println("The value you got is :" + s)).join();
		System.out.println("The End");

	}

	public static void delay(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
