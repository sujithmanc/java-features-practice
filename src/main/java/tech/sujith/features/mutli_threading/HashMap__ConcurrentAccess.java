package tech.sujith.features.mutli_threading;

import java.util.HashMap;
import java.util.Map;

public class HashMap__ConcurrentAccess {

	public static void main(String[] args) throws InterruptedException {

		Map<Integer, Integer> map = new HashMap<>();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				map.put(i, i);
				//Util.sleep();
				System.out.println(" Thread A " + i);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {

				map.get(i);
				//Util.sleep();
				System.out.println(" Thread B");

			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {

				map.remove(i);
				//Util.sleep();
				System.out.println(" Thread C");

			}

		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.println("The end");
	}

	public static void sleep(int millies) {

	}
}
