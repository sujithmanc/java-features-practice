package tech.sujith.practice.streams;

import java.util.List;
import java.util.Optional;

public class Match__Methods {
	public static void main(String[] args) {

		List<Integer> list = List.of(23, 12, 93, 32, 40);
		boolean allAreEven = list.stream().allMatch(v -> v % 2 == 0);
		System.out.println("All are even: " + allAreEven);

		boolean anyOneIsEven = list.stream().anyMatch(v -> v % 2 == 0);
		System.out.println("Any one is even: " + anyOneIsEven);

		boolean noneIsEven = list.stream().noneMatch(v -> v % 2 == 0);
		System.out.println("None is even: " + noneIsEven);

		List<Integer> sortedListNatural = list.stream().sorted().toList();
		System.out.println("Sorted List : " + sortedListNatural);

		List<Integer> sortedListDesc = list.stream().sorted((a, b) -> b - a).toList();
		System.out.println("Sorted List : " + sortedListDesc);

		Optional<Integer> first = sortedListDesc.stream().findFirst();
		System.out.println("First Element: " + first.get());

		// Find the nth large element
		var n = 1;
		// Assume if the list is [1, 2, 3, 4, 5, 6, 7]
		// Skip 0 -> Skips Nothing
		// Skip 1 -> Skips one element [2, 3, 4, 5, 6, 7]
		// Skip 2 -> Skips two Elements [3, 4, 5, 6, 7]

		Optional<Integer> nThElement = sortedListDesc.stream().skip(n).findFirst();
		System.out.println("Nth Element: " + nThElement);
		
		// Find the 2nd largest element in the list
		var l2 = List.of(43, 12, 32, 54, 9, 76, 87).stream().sorted().skip(1).findFirst();
		System.out.println("2nd element: " + l2.get());
		
		var limitedList =  list.stream().limit(3).toList(); // Return only the first 3 elements
		System.out.println("Limited List : " + limitedList);
	}
}
