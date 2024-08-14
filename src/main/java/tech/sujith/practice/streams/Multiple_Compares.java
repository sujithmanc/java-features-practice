package tech.sujith.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.dto.Employee.Dept;
import tech.sujith.practice.utils.DTOUtil;
import tech.sujith.practice.utils.JsonPrinter;

public class Multiple_Compares {
	public static void main(String[] args) {
		List<Employee> employees = DTOUtil.getEmployees();
		// JsonPrinter.printAsJsonPretty("Employee List",employees);

		List<IEmp> list = employees.stream().map(e -> new IEmp(e.getName(), e.getSalary()))
				// .sorted(Comparator.comparing(IEmp::getName).thenComparingDouble(IEmp::getSalary))
				.sorted(Comparator.comparing(IEmp::getName).thenComparing(IEmp::getSalary, Comparator.reverseOrder()))
				.toList();
		JsonPrinter.printAsJsonPretty("Employee List", list);

		// Comparator.reversed(); Note: Reverse is non-static method
		// Comparator.reverseOrder(); Note: Revere is static method.

		List<Integer> l = new ArrayList<>(Arrays.asList(2, 3, null, 6, 6, null, 4, 3, null, 234, 234, null));

		List<Integer> s = l.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).toList();
		System.out.println(s);

		List<Integer> nF = l.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).toList();
		System.out.println(nF);

		List<Integer> rF = l.stream().sorted(Comparator.nullsFirst(Comparator.reverseOrder())).toList();
		System.out.println(rF);

		List<Integer> nL = l.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).toList();
		System.out.println(nL);

		List<Integer> rL = l.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).toList();
		System.out.println(rL);

		// Sort the characters
		String str = "SujithManchala";

		StringBuilder collect = str.chars().mapToObj(i -> (char) i).sorted().collect(StringBuilder::new, (e1, e2) -> {
			System.out.println("Acc : " + e1 + " - " + e2);
			e1.append(e2);
		}, (e1, e2) -> {
			System.out.println("Comb : " + e1 + " - " + e2);
		});
		
		Iterator<Integer> ii = nL.iterator();
		

		

		System.out.println(collect);
	}

	@Data
	@AllArgsConstructor
	static class IEmp {
		String name;
		private double salary;
		// private Dept dept;
	}
}
