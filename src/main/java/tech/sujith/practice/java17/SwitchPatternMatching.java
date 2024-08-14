package tech.sujith.practice.java17;

import tech.sujith.practice.dto.Job;

public class SwitchPatternMatching {
	public void switchWithArrow() {
		String type = "B";
		switch (type) {
		case "A" -> System.out.println("A");
		case "B" -> System.out.println("B");
		case "C" -> System.out.println("C");
		}

		Job job = Job.TEAMLEADER;
		int value = switch (job) {
		case EMPLOYEE -> 1;
		case MANAGER -> 2;
		case TEAMLEADER -> 3;
		}; // Syntax error, insert ";" to complete LocalVariableDeclarationStatement
			// Note: A Switch expression should cover all possible values
		System.out.println("Job value: " + value);
		
		
	
	}
}
