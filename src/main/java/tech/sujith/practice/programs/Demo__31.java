package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.List;

public class Demo__31 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 5, 34 };
		List<Integer> list = Arrays.stream(arr).boxed().toList();
				
		// Function, BiFunction, BinaryOperator
		System.out.println(list);
	}
}
