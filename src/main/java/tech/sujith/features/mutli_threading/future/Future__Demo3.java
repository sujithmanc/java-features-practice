package tech.sujith.features.mutli_threading.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class Future__Demo3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			return m1();
		});
		
		
		
		
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			return m2();
		});
	
		cf1.thenAcceptAsync( s -> System.out.println("C1 completed: " + s));
		cf2.thenAcceptAsync( s -> System.out.println("C2 completed: " + s));
		

		
		cf1.join();
		cf2.join();
	}

	public static int m1() {
		System.out.println("Inside m1");
		delay(5);
		return 50;
	}

	public static int m2() {
		System.out.println("Inside m2");
		delay(10);
		return 40;
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
