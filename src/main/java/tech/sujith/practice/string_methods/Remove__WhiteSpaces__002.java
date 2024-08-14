package tech.sujith.practice.string_methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Remove__WhiteSpaces__002 {
	public static void main(String[] args) {
		// Remove double white spaces
		final String str = " Jaaaava    is       not      a   bad   programming   language  ";
	
		String str2 =  str.replaceAll("\s+", "*");
		String str3 =  str.replaceAll("\s+", "*");
		System.out.println(str2.strip());
		System.out.println(str3);
		
		// Replace vowels with x
	 	String str4 = str.replaceAll("[aeiou]", "x");
	 	System.out.println(str4);
	 	
	 	// Output: 
	 	
	 	final List<String> list = Arrays.asList(str.strip().split("\s+"));
	 	Collections.reverse(list);
	 	String collect = list.stream().map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
	 	System.out.println(collect);
	 	
	 	
	 	
	}
}
