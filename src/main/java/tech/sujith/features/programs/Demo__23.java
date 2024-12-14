package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Demo__23 {
	public static void main(String[] args) {
		List<String> list = new ArrayList(List.of("Sujith", "Manchala", "Kumar", "Game Changer"));
		OptionalInt reduce = list.stream().map(s -> s.length()).mapToInt(Integer::valueOf).reduce(( i, j) -> i + j);
		
		System.out.println(reduce.getAsInt());
	}
}
