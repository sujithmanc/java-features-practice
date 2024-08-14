package tech.sujith.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

class Box<T> {
	private T value;

	public Box(T t) {
		this.value = t;
	}

	public void setValue(T t) {
		this.value = t;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Box(" + value + ")";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside Box Equals method");
		if (obj instanceof Box box) {
			return this.value == box.getValue();
		}

		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside Box Equals Hash Code method");
		return Objects.hash(value);
	}
}

public class Distinct__Demo {
	public static void main(String[] args) {
		Random r = new Random();
		List<Box<Integer>> list = r.ints(100, 1, 10).mapToObj(Integer::valueOf).map(Box::new).toList();
		System.out.println(list);

		// Sort the box of integer elements
		List<Box<Integer>> sortedList = list.stream().sorted((b1, b2) -> b1.getValue() - b2.getValue()).toList();
		System.out.println("Sorted List : " + sortedList);

		// Remove duplicates
		// distinct is a state full intermediate operation.
		List<Box<Integer>> distinctList = list.stream().distinct().toList();
		System.out.println("Distinct List: " + distinctList);

		// Calculating Accorance
		// list.stream().collect(Collectors.toMap());

		// GroupBy
		Map<Box<Integer>, Long> groupByBox = list.stream()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println("Group by Box:" + groupByBox);

		Map<Integer, Long> groupByValue = list.stream()
				.collect(Collectors.groupingBy(i -> i.getValue(), Collectors.counting()));
		System.out.println("Group by Value:" + groupByValue);

		Map<Integer, List<Box<Integer>>> collect = list.stream()
				.collect(Collectors.groupingBy(i -> i.getValue(), Collectors.toList()));
		System.out.println(collect);

		Map<Box<Integer>, Integer> summingMap = list.stream()
				.collect(Collectors.groupingBy(i -> i, Collectors.summingInt(i -> i.getValue())));
		System.out.println("Summing Map: " + summingMap);
		
		//list.stream().collect(Collectors.groupingBy( i -> i.getValue(), Collectors.joining(" ")));

	}

	public static void simpleDistinct() {
		Random r = new Random();

		// r.ints(100, 1, 10) Gives the numbers in not including 10
		List<Integer> list = r.ints(100, 1, 10).mapToObj(Integer::valueOf).toList();
		System.out.println("List of elements: " + list);

		List<Integer> distinctList = list.stream().distinct().toList();
		System.out.println("Distinct List: " + distinctList);

	}
}
