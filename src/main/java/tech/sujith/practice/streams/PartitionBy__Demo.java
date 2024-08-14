package tech.sujith.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;
import tech.sujith.practice.utils.JsonPrinter;

@Data
class Emp {
	private Integer id;
	private String name;
	private String dept;
	
	public Emp(Integer id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}

public class PartitionBy__Demo {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Sujith", "CSE");
		Emp e2 = new Emp(1, "Shalini", "ECE");
		Emp e3 = new Emp(1, "Jahnavi", "EEE");
		Emp e4 = new Emp(1, "Kartheek", "CSE");
		Emp e5 = new Emp(1, "Vinay", "CSE");
		Emp e6 = new Emp(1, "Roja", "ECE");
		Emp e7 = new Emp(1, "Ajay", "CSE");
		Emp e8 = new Emp(1, "Lavanya", "ECE");
		Emp e9 = new Emp(1, "Jaisri", "EEE");
		
		List<Emp> list = List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		
		Map<Boolean, List<Emp>> collect = list.stream().collect(Collectors.partitioningBy(e -> e.getDept().equals("CSE")));
		collect.forEach( (x, y ) -> System.out.println( x + " " + y ));
		
		Map<String, String> collect2 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.mapping(Emp::getName, Collectors.joining(","))));
		JsonPrinter.printAsJsonPretty("Collector", collect2);
		
		
	}
}
