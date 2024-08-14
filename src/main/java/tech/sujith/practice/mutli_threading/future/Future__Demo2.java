package tech.sujith.practice.mutli_threading.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class Future__Demo2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			return m1();
		}).thenCombine(CompletableFuture.supplyAsync(() -> {
			return m2();
		}), (c1, c2) -> c1 + c2);

		CompletableFuture<Integer> cf3 = CompletableFuture.supplyAsync(() -> {
			return m3();
		});

		CompletableFuture<Integer> cf4 = CompletableFuture.supplyAsync(() -> {
			return m4();
		});

		CompletableFuture<Void> acceptEither = cf3.acceptEither(cf4, s -> System.out.println("Value is " + s));
		CompletableFuture<Integer> applyToEither = cf3.applyToEither(cf4, s -> s * s);
		CompletionStage<Integer> completedStage = CompletableFuture.completedStage(45);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//CompletableFuture.allOf(cf1, cf2, cf3, cf4).join();

		cf1.join();
		System.out.println("End " + cf1.get());

	}

	public static int m1() {
		System.out.println("Inside m1");
		delay(10);
		return 50;
	}

	public static int m2() {
		System.out.println("Inside m2");
		delay(10);
		return 50;
	}

	public static int m3() {
		System.out.println("Inside m3");
		delay(3);
		return 35;
	}

	public static int m4() {
		System.out.println("Inside m4");
		delay(10);
		return 1;
	}

	public static void delay(int delay) {
		try {
			for (; delay > 0; delay--) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
