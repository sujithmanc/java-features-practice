package tech.sujith.features.string_methods;

import java.util.Arrays;

public class Vowels__Present {
	public static void main(String[] args) {
		final String str = "Sujith MAnchalA";

		// WAY #1
		final int[] ints = str.chars().filter(ch -> "aeiou".indexOf(ch) > -1).toArray();

		final StringBuilder sb = new StringBuilder();
		for (int ch : ints) {
			sb.appendCodePoint(ch);
		}
		System.out.println(sb.toString());

		// WAY #2
		String string2 = str.chars().filter(ch -> "aeiou".indexOf(ch) > -1).collect(

				() -> {
					System.out.println("String Builder");
					return new StringBuilder();
				},

				(sbx, i) -> {
					System.out.println("appendCodePoint");
					sbx.appendCodePoint(i);
				},

				(sbx, sby) -> {
					System.out.println("append");
					sbx.append(sby);
				}

		).toString();

		System.out.printf("#2 Only vowels are : [%s] %n%n", string2);

		// WAY #3
		String string3 = str.chars().filter(ch -> "aeiou".indexOf(ch) > -1)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		System.out.printf("#3 Only vowels are : [%s] %n%n", string3);

		// Way #4
		String string4 = str.replaceAll("(?i)[^aeiou]", ""); // (?i) is for case sensitive flag
		System.out.printf("#4 Only vowels are : [%s] %n%n", string4);
		
	}
}
