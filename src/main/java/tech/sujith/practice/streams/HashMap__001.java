package tech.sujith.practice.streams;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import tech.sujith.practice.utils.JsonPrinter;

public class HashMap__001 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Sujith");
		map.put(2, "Vineeth");
		map.put(3, "Sumanth");
		map.put(4, "Ajay");
		map.put(5, "Divya");
		map.put(6, "Vamshi");
		
		JsonPrinter.printAsJsonPretty(map);

		List<Box> list = map.entrySet().stream().map(e -> new Box(e.getKey(), e.getValue()) ).toList();

		JsonPrinter.printAsJsonPretty(list);
		
	}
	
	
	@Data
	@AllArgsConstructor
	private static class Box {
		private Integer id;
		private String name;
	}
}
