package tech.sujith.features.programs;

import java.util.Arrays;
import java.util.List;

public class Demo__012 {
	public static void main(String[] args) {
		// Remove the vowels
		String name = "Sujithaaa 3434mancha445la";
		name = name.replaceAll("[\\s\\d]", "");
		System.out.println(name);
	}
}
