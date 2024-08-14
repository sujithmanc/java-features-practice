package tech.sujith.practice.streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntStream__Demo {
	public static void main(String[] args) {
		
		// Convert from int[] to IntStream
		int[]  intArr= {3,4,5,4,3,4,6,7,6,5,4};
		IntStream s1 = IntStream.of(intArr);
		IntStream s2 = Arrays.stream(intArr);
		
		IntStream.range(1, 11).forEach(e -> System.out.println(e));
		
		
		boolean allMatch = IntStream.range(1, 11).allMatch( i -> i % 2 == 0);
		System.out.println(allMatch);
		
		IntStream sorted = IntStream.range(1, 11).sorted();
	}
}
