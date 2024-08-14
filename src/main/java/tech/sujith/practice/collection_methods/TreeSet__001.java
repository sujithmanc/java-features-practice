package tech.sujith.practice.collection_methods;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class TreeSet__001 {
	public static void main(String[] args) {
		int[] arr = {1,9,5,7,9,7,5,1,10,10};
		
		List<Integer> list = IntStream.of(arr).boxed().toList();
		
		TreeSet<Integer> tree = new TreeSet<>(list);
		tree.forEach(t -> System.out.println(t));
		
		Integer first = tree.first();
		Integer last = tree.last();
		int[] array = IntStream.range(first, last + 1).toArray();
		System.out.println(Arrays.toString(array));
		List<Integer> list2 = IntStream.range(first, last + 1).boxed().filter(f -> tree.add(f)).toList();
		
		System.out.println(list2);
	}
}
