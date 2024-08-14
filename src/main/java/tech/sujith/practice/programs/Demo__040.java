package tech.sujith.practice.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo__040 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(3, 6, 1, 2, 4));
		
		Stream<Integer> s = new ArrayList<>(List.of(3, 6, 1, 2, 4)).stream();
	
		
		Stream<Integer> sorted = s.sorted();
		
		List<Integer> list3 = sorted.collect(Collectors.toCollection(LinkedList::new));
		

		System.out.println(list3);
		
	//	list.stream().sort(Comparator.naturalOrder()).
	
	}
}
