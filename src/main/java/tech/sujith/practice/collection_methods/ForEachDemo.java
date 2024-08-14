package tech.sujith.practice.collection_methods;

import java.util.List;
import java.util.stream.Collectors;

import tech.sujith.practice.dto.BoxDto;
import tech.sujith.practice.records.BoxRec;

public class ForEachDemo {
	public static void main(String... args) {
		var z = new ForEachDemo();
		z.forEachPrimitives();
	}

	public void forEachPrimitives() {
		var sals = List.of(34, 234, 21324, 64, 989);
		var incr = 300;

		// Increase the salary using forEach
		sals.forEach(s -> s = s + incr);

		// No change found, but why?
		System.out.println(sals); // [34, 234, 21324, 64, 989]
		// As Salaries contains primitive values, it change in place.
		
		// Solution
		List<Integer> list = sals.stream().map(s -> s + incr).toList();
		System.out.println(list);
		
	}

	public void forEachWithRecord() {
		// Random Salaries
		var sals = List.of(34, 234, 21324, 64, 989);

		// Convert them into List of Records
		// toList() is from Java 16
		List<BoxRec> list = sals.stream().map(BoxRec::new).toList();

		// Increase Box values with incSal
		list.forEach(b -> System.out.println(b.value()));

		// Note: RECORDS DON'T HAVE SETTER METHOD AS THESE ARE IMMUTABLE.
	}

	public void forEachWithStringList() {
		var strList = List.of("A", "B", "C", "D", "E");

		// Add prefix of x to all the String in list.
		strList.forEach(s -> s = 'x' + s);

		System.out.println(strList); // [A, B, C, D, E]
	}

	public void forEachWithDto() {
		// Random Salaries
		var sals = List.of(34, 234, 21324, 64, 989);

		// Convert them into List of Records
		// toList() is from Java 16
		List<BoxDto> list = sals.stream().map(BoxDto::new).toList();
		var salIncr = 300;

		// Increase Box values with incSal
		list.forEach(b -> b.setValue(b.getValue() + salIncr));
		
		System.out.println(list);
	}

}
