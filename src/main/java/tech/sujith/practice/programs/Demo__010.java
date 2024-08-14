package tech.sujith.practice.programs;

import java.util.List;
import java.util.stream.IntStream;

public class Demo__010 {
	public static void main(String[] args) {
		List<Integer> tabs = List.of(6, 8, 9);

		IntStream.range(1, 11).forEach(i -> {
			tabs.forEach(v -> {
				System.out.print((v * i) + " ");
			});
			System.out.println();
		});

		// 6 8 9
		// 12 16 18
		// 18 24 27
		// ...

	}
}
