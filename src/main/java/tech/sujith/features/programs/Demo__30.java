package tech.sujith.features.programs;

import java.util.Arrays;

public class Demo__30 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 5, 34 };
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().getAsDouble();
		long count = Arrays.stream(arr).count();
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(count);
		System.out.println(max);
		System.out.println(min);
	}
}
