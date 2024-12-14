package tech.sujith.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.dto.Employee.Dept;
import tech.sujith.practice.dto.Employee.Gender;

public class DTOUtil {

	public static List<Employee> getEmployees(){
		
		// Create ArrayList to hold Employee objects
	    List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(100, "Sujith", Dept.IT, 75000.0, LocalDate.of(2020, 5, 15), "Software Engineer", Gender.MALE));
	    employeeList.add(new Employee(101, "Harini", Dept.SALES, 60000.0, LocalDate.of(2019, 8, 22), "Sales Representative", Gender.FEMALE));
	    employeeList.add(new Employee(102, "Vamshi", Dept.IT, 80000.0, LocalDate.of(2021, 3, 10), "Marketing Manager", Gender.MALE));
	    employeeList.add(new Employee(103, "Chithra", Dept.HR, 70000.0, LocalDate.of(2022, 1, 5), "HR Specialist", Gender.FEMALE));
	    employeeList.add(new Employee(104, "Ajay", Dept.IT, 90000.0, LocalDate.of(2018, 11, 30), "Senior Software Engineer", Gender.MALE));
	    employeeList.add(new Employee(105, "Jahnavi", Dept.FINANCE, 85000.0, LocalDate.of(2020, 9, 18), "Financial Analyst", Gender.FEMALE));
	    employeeList.add(new Employee(106, "Kalyan", Dept.SALES, 65000.0, LocalDate.of(2021, 6, 25), "Sales Manager", Gender.MALE));
	    employeeList.add(new Employee(107, "Chithra", Dept.IT, 75000.0, LocalDate.of(2019, 4, 12), "Marketing Coordinator", Gender.FEMALE));
	    employeeList.add(new Employee(108, "Nagaraju", Dept.HR, 72000.0, LocalDate.of(2020, 7, 8), "Recruiter", Gender.MALE));
	    employeeList.add(new Employee(109, "Sunitha", Dept.FINANCE, 88000.0, LocalDate.of(2018, 12, 3), "Financial Manager", Gender.FEMALE));
	    employeeList.add(new Employee(110, "Nagaraju", Dept.IT, 72000.0, LocalDate.of(2022, 8, 12), "Network Administrator", Gender.MALE));
	    employeeList.add(new Employee(111, "Sunitha", Dept.SALES, 68000.0, LocalDate.of(2019, 10, 28), "Sales Associate", Gender.FEMALE));
	    employeeList.add(new Employee(112, "Ajay", Dept.MARKETING, 82000.0, LocalDate.of(2020, 4, 15), "Digital Marketing Specialist", Gender.MALE));
	    employeeList.add(new Employee(113, "Apoorva", Dept.HR, 69000.0, LocalDate.of(2018, 12, 20), "HR Generalist", Gender.FEMALE));
	    employeeList.add(new Employee(114, "Nagaraju", Dept.IT, 78000.0, LocalDate.of(2021, 7, 3), "Database Administrator", Gender.MALE));
	    employeeList.add(new Employee(115, "Chithra", Dept.FINANCE, 80000.0, LocalDate.of(2019, 5, 19), "Financial Planner", Gender.FEMALE));
	    employeeList.add(new Employee(116, "Vishlesh", Dept.SALES, 70000.0, LocalDate.of(2020, 3, 8), "Sales Consultant", Gender.MALE));
	    employeeList.add(new Employee(117, "Harini", Dept.MARKETING, 76000.0, LocalDate.of(2018, 11, 14), "Marketing Analyst", Gender.FEMALE));
	    employeeList.add(new Employee(118, "Vamshi", Dept.HR, 71000.0, LocalDate.of(2021, 9, 22), "Training Specialist", Gender.MALE));
	    employeeList.add(new Employee(119, "Chithra", Dept.IT, 83000.0, LocalDate.of(2022, 2, 7), "Software Engineer", Gender.FEMALE));

	    
		// Return ArrayList
		return employeeList;
	}
}
