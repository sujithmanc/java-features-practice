package tech.sujith.practice.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import tech.sujith.practice.utils.JsonPrinter;

public class Collections_Methods {
	public static void main(String[] args) {

		List<Integer> list1 = List.of(23, 65, 22, 98);
		List<Integer> list2 = List.of(32, 76, 20, 100);
		List<Integer> list3 = List.of(49, 56, 192, 78);

		// How to convert Unmodifiable List to Modifiable List
		var listA = new ArrayList<Integer>(list1);
		var listB = new ArrayList<Integer>(list1);
		var listC = new ArrayList<Integer>(list1);

		// Reverse a list
		JsonPrinter.printAsJsonPretty(listA);
		Collections.reverse(listA);
		JsonPrinter.printAsJsonPretty(listA);

		// Concat 3 lists
		Stream.of(list1, list2, list3).flatMap(e -> e.stream());
		Stream.of(list1, list2, list3).flatMap(Collection::stream);

		// Remove duplicates from the list
		var list = new ArrayList<Integer>();
		list.add(45);
		list.add(35);
		list.add(23);
		list.add(78);
		list.add(45);
		list.add(78);
		// #1. Using a Set
		var set = new HashSet<Integer>(list);
		JsonPrinter.printAsJsonPretty("Before Unique results", list);
		JsonPrinter.printAsJsonPretty("After  Unique results", set);

		// #2. Using Java 8 Streams distinct()
		List<Integer> unmodList = List.of(4, 4, 5, 4, 4, 4, 5, 5);
		// Note: we can work on streams even though that is unmodifiable List
		List<Integer> list4 = unmodList.stream().distinct().toList();

		JsonPrinter.printAsJsonPretty("Before Unique results", unmodList);
		JsonPrinter.printAsJsonPretty("After  Unique results", list4);

		// #3. Using Collectors.toCollection(Function)

		JsonPrinter.printAsJsonPretty("Before Unique results", unmodList);
		Set<Integer> collect2 = unmodList.stream().collect(Collectors.toSet());
		JsonPrinter.printAsJsonPretty("After  Unique results", collect2);

		// Find intersection of two sets
		Set<Integer> set1213 = new HashSet<Integer>(Set.of(2, 3, 4, 5));
		Set<Integer> set1214 = new HashSet<Integer>(Set.of( 4, 5, 6, 7));
		
		JsonPrinter.printAsJsonPretty("Set 1", set1213);
		JsonPrinter.printAsJsonPretty("Set 2", set1214);
		
		Set<Integer> unionSet = new HashSet<Integer>(set1213);
		JsonPrinter.printAsJsonPretty("Set 1 Copy Set", unionSet);
		unionSet.addAll(set1214);
		JsonPrinter.printAsJsonPretty("Union Set", unionSet);
		JsonPrinter.printAsJsonPretty("Set 1", set1213);
		JsonPrinter.printAsJsonPretty("Set 2", set1214);
		
		Set<Integer> intersection = new HashSet<Integer>(set1213);
		JsonPrinter.printAsJsonPretty("Set 1 Copy Set", intersection);
		intersection.retainAll(set1214);
		JsonPrinter.printAsJsonPretty("Intersection Set", intersection);
		JsonPrinter.printAsJsonPretty("Set 1", set1213);
		JsonPrinter.printAsJsonPretty("Set 2", set1214);
		

		// Find two sets are disjoint

		// Can we use streams on unmodifiable List? YES
		
		
		
		// Break a List into two parts
		int[] array = IntStream.range(1, 10).toArray(); // 1-9
		int[] array2 = IntStream.rangeClosed(1, 10).toArray(); //1-10

		JsonPrinter.printAsJsonPretty("Range Open", array);
		JsonPrinter.printAsJsonPretty("Range Closed", array2);
		
		List<Integer> collect3 = Arrays.stream(array2).boxed().collect(Collectors.toList());
		JsonPrinter.printAsJsonPretty("List of Integers", collect3);
		// Find a list is paradrone or not
		
		// How to convert Modifiable List to Unmodifiable List
		collect3.subList(0, 0);
		Optional<Integer> findFirst = collect3.stream().findFirst();
		
		// #1. Using Collections.unmodifiableList

		var unmodifiableList = Collections.unmodifiableList(listA);

		// #2. Using Collections.toUnmodifiableList
		List<Integer> collect = listB.stream().collect(Collectors.toUnmodifiableList());

		Collection<Integer> coll = collect;
		
		
	
		

	}

}
