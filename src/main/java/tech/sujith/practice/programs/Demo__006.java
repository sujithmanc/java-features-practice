package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo__006 {
	public static void main(String[] args) {
		String str = "Hello, World!";
		String[] split = str.strip().split("");

		// By default it will use HashMap
		Map<String, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity()));

		// With Aggregation Functions

		// SUM
		Map<String, Integer> collect2 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> e.length())));

		// COUNT
		Map<String, Double> collect7 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.averagingInt(e -> e.length())));

		// AVERAGE
		Map<String, Long> collect8 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// MAX
		Map<String, Optional<String>> collect10 = Arrays.stream(split).collect(
				Collectors.groupingBy(Function.identity(), Collectors.maxBy((e1, e2) -> e1.length() - e2.length())));

		// MAX
		Map<String, Optional<String>> collect11 = Arrays.stream(split).collect(
				Collectors.groupingBy(Function.identity(), Collectors.minBy((e1, e2) -> e1.length() - e2.length())));
		
		// With Different Value Collection
		Map<String, Set<String>> collect3 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.toSet()));

		// To different collection
		LinkedHashMap<String, Set<String>> collect4 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.toSet()));

		TreeMap<String, Set<String>> collect5 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.toSet()));

		// Aggregation with Different Collection
		TreeMap<String, Long> collect6 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		
		
		 Map<Boolean, List<String>> collect9 = Arrays.stream(split)
			.collect(Collectors.partitioningBy(e -> e.length() % 2 == 0));
		 

	}

}
