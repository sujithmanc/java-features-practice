package tech.sujith.practice.collection_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.dto.Employee.Dept;
import tech.sujith.practice.utils.DTOUtil;

public class ConcurrentHashMap__001 {
	public static void main(String[] args) {

		List<Employee> employees = DTOUtil.getEmployees();
		Set<Double> salaries = new HashSet<>();
		List<Employee> list = employees.stream().filter(e -> salaries.add(e.getSalary())).toList();

		System.out.println("Size : " + employees.size());
		System.out.println("Size : " + list.size());
		list.forEach(l -> System.out.println(l));

		Map<Double, Employee> collect = employees.stream()
				.collect(Collectors.toMap(e -> e.getSalary(), e -> e, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Size : " + collect.size());
		
	

		Map<Dept, List<Employee>> collect2 = employees.stream().collect(Collectors.groupingBy(e -> e.getDept()));
		
		
		// Selected candidates
		
		Employee[] array = employees.toArray(Employee[]::new);
		List<Employee> asList = Arrays.asList(array );
		
		
		
		
	}
}
