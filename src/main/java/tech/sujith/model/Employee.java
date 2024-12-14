package tech.sujith.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import tech.sujith.enums.Dept;
import tech.sujith.enums.Gender;

@Data
public class Employee {
	
    private int id;
    private String name;
    private Dept dept;
    private double salary;
    private LocalDate hireDate;
    private String job;
    private Gender gender;
    private List<Bank> banks;

    public Employee(int id, String name, List<Bank> banks) {
		super();
		this.id = id;
		this.name = name;
		this.banks = banks;
	}

	public Employee(int id, String name, Dept dept, double salary, LocalDate localDate, String job, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.hireDate = localDate;
		this.job = job;
		this.gender = gender;

	}
}