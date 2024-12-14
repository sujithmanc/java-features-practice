package tech.sujith.features.collection_methods;

import java.util.List;

import tech.sujith.features.dto.Employee;
import tech.sujith.utils.DTOUtil;
import tech.sujith.utils.JsonPrinter;

public class Collection__003 {
	public static void main(String[] args) {
		
		List<Employee> employees = DTOUtil.getEmployees();
		
		JsonPrinter.printAsJsonPretty("Employees", employees);
	}
}
