package tech.sujith.features.mutli_threading.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Future__Demo_ThenCombile {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			return m1();
		});
		
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			return m2();
		});
		
		CompletableFuture<Integer> cf3 = CompletableFuture.supplyAsync(() -> {
			return m3();
		});
		
		CompletableFuture<Integer> cf4 = CompletableFuture.supplyAsync(() -> {
			return m4();
		});
	

		CompletableFuture.allOf(cf1, cf2, cf3, cf4).join();
		System.out.println("End");
		
		
	}

	public static int m1() {
		System.out.println("Inside m1");
		delay(2000);
		return 10;
	}

	public static int m2() {
		System.out.println("Inside m2");
		delay(4000);
		return 20;
	}

	public static int m3() {
		System.out.println("Inside m3");
		delay(3000);
		return 35;
	}

	public static int m4() {
		System.out.println("Inside m4");
		delay(1000);
		return 1;
	}

	public static void delay(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
