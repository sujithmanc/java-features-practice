package tech.sujith.practice.collection_methods;

import java.util.List;

import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.utils.DTOUtil;
import tech.sujith.practice.utils.JsonPrinter;

public class Collection__003 {
	public static void main(String[] args) {
		
		List<Employee> employees = DTOUtil.getEmployees();
		
		JsonPrinter.printAsJsonPretty("Employees", employees);
	}
}