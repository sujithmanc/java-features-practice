package tech.sujith.utils;

public class Util {
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void sleep() {
		sleep(1000);
	}
	
	public static void sleep1sec() {
		sleep(2000);
	}
	public static void sleep2sec() {
		sleep(3000);
	}
	
	
}
