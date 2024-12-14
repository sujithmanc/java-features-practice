package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import tech.sujith.utils.JsonPrinter;

public class StringMethods__001 {
	public static void main(String[] args) {
		final String str = "      Failure    is    the     first     stone    of      success     ";
		String[] split = str.trim().split("\\s+");
		JsonPrinter.printAsJsonPretty("After split", split);

		List<String> list = Arrays.stream(split).map(s -> new StringBuilder(s).reverse().toString()).toList();
		String join = String.join(" ", list);
		System.out.println(join);

		String collect = Arrays.stream(split).map(s -> new StringBuilder(s).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(collect);

		// ------------ Conver into Title case ---------------
		String collect2 = Arrays.stream(str.strip().split("\\s+"))
		.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
		.collect(Collectors.joining(" "));
		System.out.println(collect2);
		
		// -----------------------------
		String str2 = "abc@gmailcom";
		boolean matches = str2.matches("^[a-z]+@[a-z]+\\.com$");
		System.out.println(matches);
		
		 int[] array = str2.chars().map(i -> i - 96).filter(i -> i <= 26 && i >= 0).toArray();
		 JsonPrinter.printAsJsonPretty("Character ", array);
		 
		 // Change the name of the user
		 String str3 = "Hello, Sujith";
		 str3 =  str3.substring(0, 7) + "Vineeth";
		 System.out.println(str3);
		 
		// Count Vowels
		long count = Arrays.stream(str3.split(""))
			.filter(s -> "aeiou".contains(s))
			.count();	
		System.out.println(count); 
		
		 
		// Encryption
		final String str4 = "abcABC";
		int[] array2 = str4.chars().map( ch -> (ch - (Character.isUpperCase(ch) ? 'A' : 'a') ) % 26 ).toArray(); 
		JsonPrinter.printAsJsonPretty("array2 ", array2);
	}
}
