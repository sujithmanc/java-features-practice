package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.Collections;

public class Reversing__001 {
	public static void main(String[] args) {

		// Input : Sujith
		// Output: htijuS
		String name = "Sujith";
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		System.out.println(sb);

		// Input : Failure is not final
		// Output: reuliaF si ton lanif
		String msg = "Failure           is,             not              final";

		String[] split = msg.split("\\s+");
		// S -> WhiteSpace -> Spaces, Tabs, line, Breaks

		System.out.println(split.length);
		System.out.println(Arrays.toString(split));

		// Input: Failure is not final
		// Output: final not is Failure

		// Split a sting by ,

	}
}
