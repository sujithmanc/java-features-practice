package tech.sujith.utils;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class SleepUtil {

	public static void sleep(Duration duration) {
		try {
			Thread.sleep(duration);
		} catch (Exception ex) {
			JsonPrinter.printAsJsonPretty(ex);
		}
	}

	public static int sleep(int seconds) {
		try {
			Thread.sleep(Duration.ofSeconds(seconds));
		} catch (Exception ex) {
			JsonPrinter.printAsJsonPretty(ex);
		}
		return 1;
	}

	public static long sleep(int minSeconds, int maxSeconds) {
		long randomNumber = getRandomNumber(minSeconds, maxSeconds, 1_000);
		try {
			Thread.sleep(randomNumber);
		} catch (Exception ex) {
			JsonPrinter.printAsJsonPretty(ex);
		}
		return randomNumber;
	}

	private static long getRandomNumber(int min, int max, int times) {
		return ThreadLocalRandom.current().nextInt(min, max + 1) * times;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			System.out.println("Hey: " + sleep(1));
		}
	}

}
