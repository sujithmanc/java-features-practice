package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo__007 {
	public static void main(String[] args) {
		String str = "AbCdEfGAjBkcLmNo";
		Map<String, Long> hashMap = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> linkedHashMap = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		Map<String, Long> treeMap = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),() -> new TreeMap<>(String::compareToIgnoreCase), Collectors.counting()));

		System.out.println(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(treeMap);

	}
}
