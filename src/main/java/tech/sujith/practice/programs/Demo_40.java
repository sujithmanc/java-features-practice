package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;
import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.dto.Employee.Dept;
import tech.sujith.practice.utils.DTOUtil;
import tech.sujith.practice.utils.JsonPrinter;

public class Demo_40 {

	public static void main(String[] args) {
		List<Employee> employees = DTOUtil.getEmployees();

		Map<Integer, Dept> collect = employees.stream().sorted(Comparator.comparing(Employee::getDept))
				.collect(Collectors.toMap(Employee::getId, Employee::getDept, (e1, e2) -> e1, LinkedHashMap::new));

		JsonPrinter.printAsJsonPretty(collect);

		@Data
		class I {
			private int id;
			private String name;
			private Dept dept;
			private double salary;
			
			public I(int id) {
				super();
				this.id = id;
			}
		}
		
		String  str = "ABCD";
		
		Arrays.stream(str.split(str));
		System.out.println(str.chars().mapToObj(c->(char)c).reduce("",(c1,c2)->c2+c1, (s1,s2)->s2+s1));

	}

}
