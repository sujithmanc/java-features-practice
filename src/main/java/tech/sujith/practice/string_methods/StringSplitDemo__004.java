package tech.sujith.practice.string_methods;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import tech.sujith.practice.utils.JsonPrinter;

public class StringSplitDemo__004 {
	public static void main(String[] args) {
		String str = "name=test,salary=123,age=23";
		Map<String, String> collect = Arrays.stream(str.split(","))
				.collect(Collectors.toMap(s -> s.split("=")[0], s -> s.split("=")[1]));
		
		JsonPrinter.printAsJsonPretty("My data", collect);
	
	}
}
