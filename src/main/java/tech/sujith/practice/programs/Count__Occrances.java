package tech.sujith.practice.programs;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count__Occrances {
	public static void main(String[] args) {
		String str = "I am at 3434 can you come to 342    fgdfgd";
		// Extract numbers
		String[] number = str.split("[^\\d]+");

		Integer collect = Arrays.stream(number).filter(s -> !s.isBlank()).map(Integer::parseInt)
				.collect(Collectors.summingInt(e -> e));

		System.out.println(Arrays.toString(number));
		System.out.println(collect);
	}
}
