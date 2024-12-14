package tech.sujith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.sujith.enums.Gender;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private Integer age;
    private Integer marks;
    private Gender gender;
    private Double scholarship;
    
    public Student(Long id, String name, Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}