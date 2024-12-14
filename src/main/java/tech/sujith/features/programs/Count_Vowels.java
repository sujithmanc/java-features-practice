package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Count_Vowels {
	public static void main(String[] args) {
		String str = "sujith Manchala";
		String vowels = "aeiou";
		IntStream vowelStream = vowels.chars();

	
		
		long count = Arrays.stream(str.split("")).filter(vowels::contains).count(); 
		System.out.println(count);
		
	}
}
