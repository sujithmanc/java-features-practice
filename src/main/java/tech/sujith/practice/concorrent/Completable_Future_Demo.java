package tech.sujith.practice.concorrent;

import java.util.concurrent.CompletableFuture;

import tech.sujith.utils.Util;

public class Completable_Future_Demo {
	public static void main(String[] args) {
		CompletableFuture<Integer> runAsync = CompletableFuture.supplyAsync(() -> {
			System.out.println("Task to Find X started");
			Util.sleep2sec();
			System.out.println("Task to Find X ended");
			return 10;
		});

		CompletableFuture<Integer> thenApply = runAsync.thenApply(v -> {
			System.out.println("Task to Find Y started");
			Util.sleep2sec();
			System.out.println("Task to Find Y ended");
			return v * v;
		});

		thenApply.thenAccept(v -> System.out.println(v));
		
		runAsync.join();
		thenApply.join();
		System.out.println("Main method ended");
	}
}
