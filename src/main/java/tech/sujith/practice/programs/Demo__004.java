package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Demo__004 {
	public static void main(String[] args) {
		// final String str = "How a are you ?";
		final String str = "I bam a big fan of yobu!";

		final String refineString = str.replaceAll("\s", "");
		String[] split = refineString.split("");

		List<String> list = Arrays.stream(split).filter(f -> str.lastIndexOf(f) != str.indexOf(f)).toList();
		long count = list.stream().filter(f -> f.equals(list.get(0))).count();
		System.out.println(list.get(0) + " : " + count);

		refineString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
				.stream().filter(j -> j.getValue() > 1).findFirst().ifPresent(System.out::println);
		
		Map<Character, Long> collect = refineString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(collect);
		
		 TreeMap<Character, Long> collect2 = collect.entrySet().stream()
				.sorted((e1, e2) ->  (int)( e2.getValue() - e1.getValue()))
				//.toList();
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, TreeMap::new));
				
		
				
		
		System.out.println(collect2);

		// str.chars().mapToObj(c->(char)c);
		// .collect(Collectors.groupingBy(e->e,Collectors.counting()));
		// .entrySet().stream().filter(j->j.getValue()>1).findFirst().ifPresent(System.out::println);

		// str.chars().mapToObj(i -> Character.strin)
	}
}
