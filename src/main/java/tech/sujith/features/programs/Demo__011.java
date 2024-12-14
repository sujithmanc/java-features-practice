package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo__011 {
	public static void main(String[] args) {
		
		// Find the 2nd largest number
		List<Integer> list = new ArrayList<Integer>(List.of(54, 33, 12, 8, 12, 98));
		
		Integer integer = list.stream()
					.distinct()
					.sorted(Comparator.reverseOrder())
					.skip(1).findFirst().get();
		System.out.println(integer);
	
		TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		set.addAll(list);
		set.pollFirst();
		
		System.out.println(set.first());


	}
	
	
}
