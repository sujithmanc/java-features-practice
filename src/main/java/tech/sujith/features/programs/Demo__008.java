package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo__008 {
	public static void main(String[] args) {
		// Input : I am Sujith Manchala
		// Output: alahcnaM htijus ma I
		
		String str = "I am Sujith Manchala";
		
		List<String> list = Arrays.asList(str.split("\s"));
		// list.add("Name"); java.lang.UnsupportedOperationException
		String collect = Arrays.stream(str.split("\s")).map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		
		List<String> list2 = Arrays.stream(str.split("\s")).map(s -> new StringBuilder(s).reverse().toString()).toList();
		
		List<String> l = new ArrayList<>(list2);
		Collections.reverse(l);
		
		
		System.out.println(l);
	}
}
