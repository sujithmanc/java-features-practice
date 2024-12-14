package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Demo__25 {
	public static void main(String[] args) {
		String str = "aaasssrrrrrrreewwesfsssdfdfdfffdfdfdzzzzzzzzfdfdfdfdfkkkkkkererrrrrrrrrrrrrrrrrr";
		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length - 2; i++) {
			char ch = arr[i]; // 0
			int s = i;
			while (i < arr.length -1 && ch == arr[++i]);
			i--;
			System.out.println(ch + "   " + s + "-" + i);

		}

	}
}
