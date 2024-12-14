package tech.sujith.features.programs;

public class Count_The_Digits_In_Number {
	public static void main(String[] args) {
		int n = 234;
		int v = n;
		int sum = 0;
		while (v > 0) {
			int t = v % 10;
			sum += t;
			v /= 10;
		}
		System.out.println(sum);
	}
}
