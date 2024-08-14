package tech.sujith.practice.programs;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Demo__22 {
	public static void main(String[] args) {
		List<Integer> list = new Random().ints(10, 100, 1000).boxed().toList();
		System.out.println(list);

		Integer secMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secMax);
	}
}
