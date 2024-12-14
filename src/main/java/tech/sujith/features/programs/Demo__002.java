package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo__002 {
	public static void main(String[] args) {
		
		
		
		String name = "Sujith Manchala";
		// Get the count of each vowel in name using Streams
	
		String[] split = name.toLowerCase().split("");
		
		Map<String, Long> collect = Arrays.stream(split).filter( ch -> "aeiou".contains(ch) ).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		collect.forEach(
				(ch, count) -> System.out.println(ch + ":" + count)
		);
		
		
		
		
		
		
	}
}
