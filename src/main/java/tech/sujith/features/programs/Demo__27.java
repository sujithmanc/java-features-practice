package tech.sujith.features.programs;

import java.util.List;
import java.util.stream.Collectors;

import tech.sujith.features.dto.Employee;
import tech.sujith.utils.DTOUtil;
import tech.sujith.utils.JsonPrinter;

public class Demo__27 {
	public static void main(String[] args) {
		List<Employee> employees = DTOUtil.getEmployees();
		JsonPrinter.printAsJsonPretty(employees);
		
		Double collect = employees.stream().map(Employee::getSalary).collect(Collectors.summingDouble(e -> e));
	 	Double collect2 = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
	 	System.out.println(collect);
	 	System.out.println(collect2);
	}
}
