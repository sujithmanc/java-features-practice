package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		System.out.println(m1("java"));
		String[] words= {"java","ajav","vaja","xyz","epam","mape"};
		
		Map<String, List<String>> collect = Stream.of(words).sorted().collect(Collectors.groupingBy(Test::m1));
		System.out.println(collect);
	}

	static String m1(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);

	}

}
