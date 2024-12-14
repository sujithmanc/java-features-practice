package tech.sujith.reactive.streams;

import tech.sujith.utils.JsonPrinter;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {25, 29, 35, 36, 39, 46, 48, 51, 58, 60, 66, 69, 74, 74, 77, 82, 89, 91, 93,98};
		JsonPrinter.printAsJson(arr.length);
	}
}
