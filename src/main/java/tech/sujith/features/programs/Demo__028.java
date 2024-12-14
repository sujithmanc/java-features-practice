package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo__028 {
	public static void main(String[] args) {
		// int <-> String
		// int <-> char
		// String <-> char
		// int <-> double

		// String -> Integer: Integer.valueOf(String)
		// String -> int : Integer.parseInt(String)
		// Premitives, Object -> String : String.valueOf
		String str = "1234";

		Integer collect = Arrays.stream(str.split("")).map(s -> Character.valueOf(s.charAt(0)))
				.filter(Character::isDigit).collect(Collectors.summingInt(Character::getNumericValue));
		
		
		Stream<Character> charStream = str.chars().mapToObj(i -> (char) i);
		Stream<Character> charStream2 = Arrays.stream(str.split("")).map(s -> Character.valueOf(s.charAt(0)));

		
		
		int sum = str.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
		

		
		
		System.out.println(sum);
		
		
		
		
		
		
		System.out.println(collect);

		str.chars().mapToObj(i -> (char) i);

		String num = "sf2sd42f3s13rdfsf";

	}
}
