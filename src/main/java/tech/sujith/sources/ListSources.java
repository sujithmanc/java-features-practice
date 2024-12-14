package tech.sujith.sources;

import java.util.ArrayList;
import java.util.List;

import tech.sujith.enums.Gender;
import tech.sujith.model.Student;

public class ListSources {
	public static List<Student> getStudentList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1L, "Alice", 20, 91, Gender.FEMALE, 1000.0)); 
        students.add(new Student(2L, "Bob", 22, 39, Gender.MALE, 500.0));
        students.add(new Student(3L, "Charlie", 19, 74, Gender.MALE, 0.0));
        students.add(new Student(4L, "David", 21, 25, Gender.MALE, 1500.0));
        students.add(new Student(5L, "Emily", 18, 58, Gender.FEMALE, 0.0));
        students.add(new Student(6L, "Frank", 23, 98, Gender.MALE, 1000.0));
        students.add(new Student(7L, "Grace", 20, 66, Gender.FEMALE, 500.0));
        students.add(new Student(8L, "Harry", 21, 29, Gender.MALE, 0.0));
        students.add(new Student(9L, "Isabella", 19, 46, Gender.FEMALE, 0.0));
        students.add(new Student(10L, "Jack", 22, 35, Gender.MALE, 2000.0));
        students.add(new Student(11L, "Kate", 18, 77, Gender.FEMALE, 750.0)); 
        students.add(new Student(12L, "Liam", 20, 82, Gender.MALE, 1200.0));
        students.add(new Student(13L, "Olivia", 21, 51, Gender.FEMALE, 250.0)); 
        students.add(new Student(14L, "Noah", 23, 60, Gender.MALE, 1800.0));
        students.add(new Student(15L, "Sophia", 19, 36, Gender.FEMALE, 500.0)); 
        students.add(new Student(16L, "Ethan", 20, 48, Gender.MALE, 1000.0));
        students.add(new Student(17L, "Emma", 21, 89, Gender.FEMALE, 700.0)); 
        students.add(new Student(18L, "James", 22, 74, Gender.MALE, 1500.0)); 
        students.add(new Student(19L, "Chloe", 19, 93, Gender.FEMALE, 0.0)); 
        students.add(new Student(20L, "William", 20, 69, Gender.MALE, 1000.0)); 
		return students;
	}
}
