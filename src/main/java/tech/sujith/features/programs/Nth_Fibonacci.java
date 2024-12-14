package tech.sujith.features.programs;

public class Nth_Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 7;
		for (int i = 2; i <= n; i++) { 
			int c = a + b;
			a = b;
			b = c;
			System.out.println(i + " "+ b);
		}
		
		// count the digits in a number
	}
}
