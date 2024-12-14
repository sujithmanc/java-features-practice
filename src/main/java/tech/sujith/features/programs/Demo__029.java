package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo__029 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(null, null, null, 12, null, 123, 165, 5564, null, 3424));
		List<Integer> list2 = list.stream().sorted(Comparator.nullsLast( (e1, e2) -> e2 - e1)).toList();
		System.out.println(list2);
	}
	
}
