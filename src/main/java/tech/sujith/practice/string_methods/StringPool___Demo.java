package tech.sujith.practice.string_methods;

import java.util.stream.Stream;

public class StringPool___Demo {
	public static void main(String[] args) {
		
		String str = new String("Sujith");
		String str2 = "Sujith";
		String str3 = "Sujith";
		
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str);
		
		
		Stream.of("Sujith Manchala".split(" ")).map(StringBuilder::new).map(f -> f.reverse()).forEach( e -> System.out.println(e));
		
		
		int sum = "Sujith".chars().sum();
		System.out.println(sum % 101);
		
		
	}
}
