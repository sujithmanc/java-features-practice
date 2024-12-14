package tech.sujith.features.programs;

import java.io.Serializable;

public class Demo__014 {
	private static volatile int MY_INT = 0;

	public static void main(String[] args) {
		new Thread(() -> {
			MY_INT++;
		}).start();

		new Thread(() -> {
			System.out.println(MY_INT);
		}).start();
	}
}

