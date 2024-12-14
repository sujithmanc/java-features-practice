package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo__005 {
	public static void main(String[] args) {
		// Remove duplicate characters
		// Count vowels
		// Count vowels in order
		// Find the chars which are exactly repeated two times
		// Find most occurred character
		// Refine the text which contains multiple spaces with single space.
		// Count all the characters order wise.
		// Remove all the numbers and special characters
		// Remove only numbers
		// Validate a String
		// Print non duplicate elements!
		// Count non duplicate and duplicate elements
		// Count Map of all the character in INDEX WISE
		// Count Map of all the character in COUNT WISE
		// Distinct elements = Distinct Duplicates + Non-Duplicates

		// [1,2,3,4,3,4,5,6,7]
		// Duplicates [3, 4, 3, 4]
		// Distinct Duplicates [3,4]
		// Non-Duplicates [1, 2, 5, 6, 7]
		// Distinct elements: [1,2,3,4,5,6,7]

		// Duplicates
		String str = "hello! this is oliva";
		String[] split = str.strip().split("");
		List<String> list = Arrays.stream(split).filter(s -> str.lastIndexOf(s) != str.indexOf(s)).toList();
		System.out.println(list);

		int index = 0;
	
	}
	
}
