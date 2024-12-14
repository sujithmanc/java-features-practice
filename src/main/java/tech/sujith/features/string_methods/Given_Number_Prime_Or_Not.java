package tech.sujith.features.string_methods;

public class Given_Number_Prime_Or_Not {
	public static void main(String[] args) {
		int n = 89;
	
		boolean prime = true;
		for(int i = 2; i < n ;i++) {
			if(n % i == 0) {
				System.out.printf("%d is divisible by %d %n", n, i);
				prime = false;
				break;
			}
		}
		System.out.printf("%d is prime number: %b %n", n, prime);
	}
	
}
