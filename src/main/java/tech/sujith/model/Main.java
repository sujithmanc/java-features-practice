package tech.sujith.model;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(1, "John", 85), new Student(2, "Alice", 75),
				new Student(3, "Bob", 65), new Student(4, "Charlie", 55), new Student(5, "Emma", 45),
				new Student(6, "Frank", 35), new Student(7, "Grace", 90));

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
