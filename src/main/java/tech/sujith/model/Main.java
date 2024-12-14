package tech.sujith.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tech.sujith.sources.ListSources;


public class Main {
	public static void main(String[] args) {
		
		List<Student> students = ListSources.getStudentList();

		Map<String, List<Student>> gradeMap = students.stream().collect(Collectors.groupingBy(student -> {
			if (student.getMarks() >= 80)
				return "A";
			else if (student.getMarks() >= 70)
				return "";
			else if (student.getMarks() >= 60)
				return "C";
			else if (student.getMarks() >= 50)
				return "D";
			else if (student.getMarks() >= 40)
				return "E";
			else
				return "F";
		}));

		Map<Integer, Long> collect = students.stream().collect(Collectors.groupingBy(student -> {
			if (student.getMarks() >= 80)
				return 1;
			else if (student.getMarks() >= 70)
				return 2;
			else if (student.getMarks() >= 60)
				return 3;
			else if (student.getMarks() >= 50)
				return 4;
			else if (student.getMarks() >= 40)
				return 5;
			else
				return 6;
		}, Collectors.counting()));

		System.out.println(collect);
		
		// Printing the grades and corresponding students
		gradeMap.forEach((grade, studentList) -> {
			System.out.println("Grade " + grade + ":");
			studentList.forEach(student -> {
				System.out.println(student.getName() + " (ID: " + student.getId() + ")");
			});
			System.out.println();
		});
	}
}
