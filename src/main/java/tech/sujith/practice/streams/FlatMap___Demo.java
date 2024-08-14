package tech.sujith.practice.streams;

import java.util.List;
import java.util.stream.Stream;

import tech.sujith.practice.dto.Bank;
import tech.sujith.practice.dto.Employee;
import tech.sujith.practice.utils.JsonPrinter;

public class FlatMap___Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sujith", List.of(new Bank("SBI"), new Bank("HDFC"), new Bank("ICICI")));
		Employee e2 = new Employee(101, "Jhonny", List.of(new Bank("CITY"), new Bank("HDFC")));
		List<Employee> list = List.of(e1, e2);

		// Collect to List
		List<Bank> banksList = list.stream().flatMap(e -> e.getBanks().stream()).toList();
		
		JsonPrinter.printAsJsonPretty(banksList);
		
		// Collect into Set to void duplicate bank names
		System.out.println("Removed duplicates: ");
		
		List<Bank> banksList2 = list.stream().flatMap(e -> e.getBanks().stream()).distinct().toList();
		JsonPrinter.printAsJsonPretty(banksList2);
	}
}
