package tech.sujith.features.collection_methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class List_of_Vs_Arrays_asList {
	public static void main(String[] args) {
		Integer[] arr = {4,5,6,7,8,9,7,6,10,2,9};
		List<Integer> arrList = Arrays.asList(arr);
		List<Integer> list = List.of(arr);
	
		
		
		
//		arrList.add(67);
//		list.add(76);
		
		// Find the largest of the list
		Integer value1 = list.stream().max(Integer::compareTo).orElse(0);
		Integer value2 = list.stream().min(Integer::compareTo).orElse(0);
		System.out.println(value1);
		System.out.println(value2);
		
		// How many ways can you sort a list
		List<Integer> way1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<Integer> way2 = list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
		List<Integer> way3 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(way1);
		System.out.println(way2);
		System.out.println(way3);
		
		// How many ways can we reverse a list
		Collections.reverse(list);
		Collections.rotate(list, list.size());
	}
	
}
