package tech.sujith.reactive.streams;

import java.util.Arrays;
import java.util.List;

import tech.sujith.model.Student;
import tech.sujith.sources.ListSources;
import tech.sujith.utils.JsonPrinter;

public class Demo1 {
	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 15, 17, 20 };
		
		System.out.println(Arrays.stream(arr).anyMatch( i -> i == 4));

		//ListSources.getStudentList().stream().filter(student -> student.getId()).toList();

		// int[] contains selected Students and List<Student> contains all the students.
		// Get only Selected Students!
		
		List<Student> list = ListSources.getStudentList().stream().filter(std -> Arrays.stream(arr).anyMatch( i -> std.getId() == i)).toList();
		list.forEach(e -> System.out.println(e.getId() +" " + e.getName()));
		
		
		// List<Integer> contains selected Students and List<Student> contains all the
		// students. Get only Selected Students!

		// Stream<Integer> contains selected Students and List<Student> contains all the
		// students. Get only Selected Students!

		// int[] contains selected Students and List<Student> contains all the students.
		// Get only Selected Students!

		// List<Integer> contains selected Students and List<Student> contains all the
		// students. Get only Selected Students!

		// Stream<Integer> contains selected Students and List<Student> contains all the
		// students. Get only Selected Students!

		JsonPrinter.printAsJson(arr.length);
	}
}
