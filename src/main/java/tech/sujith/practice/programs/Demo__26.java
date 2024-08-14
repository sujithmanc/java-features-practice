package tech.sujith.practice.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Demo__26 {
	public static void main(String[] args) {
		String str = "aaasssrrrrrrreewwesfsssdfdfdfffdfdfdzzzzzzzzfdfdfdfdfkkkkkkererrrrrrrrrrrrrrrrrr";
		
		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			int s = i, count = 1;
			while(i < arr.length -1 && ch == arr[++i]) { // 3
				count++;
			}
			if(i < arr.length - 1) {
				i--;
			}
			System.out.println(ch + " " + count);
			if(i == str.length() ) {
				break;
			}
			count = 0;
			

		}

	}
}
