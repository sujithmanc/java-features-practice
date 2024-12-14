package tech.sujith.features.java15;


// Switch Patterns are the Java 13 features
// Using yield, we can now effectively return values from a switch expression:

public class SwitchPatternTest {
	public static void main(String[] args) {
		int opt = 2;
		int n = 100;
		int ans = switch (opt) {
		case 1 -> {
			System.out.printf("Doubling the value %d %n", n);
			yield n + n;
		}
		case 2 -> {
			System.out.printf("Finding the squre of %d %n", n);
			yield n * n;
		}

		default -> 54;
		};
		System.out.printf("Answer: %d %n", ans);
	}
}
