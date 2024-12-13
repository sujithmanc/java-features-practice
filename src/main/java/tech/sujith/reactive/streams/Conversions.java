package tech.sujith.reactive.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Conversions {
	public static void main(String[] args) {
		
		// int[] -> IntStream -> Stream<Integer> -> List<Integer> -> Integer[]
		// int[] -> IntStream -> Stream<Integer> -> Integer[]
		// Integer[] -> Stream<Integer> -> IntStream -> int[]
		// Integer[] -> Stream<Integer>

		int[] arr = { 7, 3, 4, 10, 2, 9, 6, 5, 1, 8 };

		// int[] -> List<Integer> Not Directly possible

		// int[] -> IntStream
		IntStream intStream = Arrays.stream(arr);

		// IntStream -> Stream<Integer>
		Stream<Integer> streamOfInts = intStream.boxed();

		// Stream<Integer> -> List<Integer>
		List<Integer> intList = streamOfInts.toList();
		System.out.println(intList);

	

		// List<Integer> -> int[]
		int[] primitiveIntArray = intList.stream().mapToInt(Integer::intValue).toArray();

		// List<Integer> -> Stream<Integer>
		Integer[] wrapperIntArr = intList.stream().toArray(Integer[]::new);

		// Integer[] -> List<Integer>
		Stream<Integer> stream = Arrays.stream(wrapperIntArr);
		List<Integer> list = stream.toList();
	}
}
