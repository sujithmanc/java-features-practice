package tech.sujith.practice.string_methods;

public class Palindrome_Or_Not__001 {
	public static void main(String[] args) {
		String str = "radarf";
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			System.out.printf("%d <-> %d %n", i , n - i - 1);
			if(str.charAt(i) != str.charAt(n - i - 1)) {
				throw new RuntimeException("Not a pallendrone");
			}
		}
		System.out.println("This is pallendrome");

	}
}
