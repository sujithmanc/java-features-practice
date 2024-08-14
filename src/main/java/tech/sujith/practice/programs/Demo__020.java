package tech.sujith.practice.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo__020 {
	public static void main(String[] args) {
		String name = "Sujith6 Man7 cha6 l9a";
		// Remove spaces and numbers
		String[] split = name.split("[\\s\\d]+");
	 	String cleanName = name.replaceAll("[\\s\\d]+", "");
		System.out.println(Arrays.toString(split));
		System.out.println(cleanName);
		
		Map<Character, Integer> list = new LinkedHashMap<>();
//		for(char ch : cleanName.toCharArray()) {
//		// Outer for can be a STREAM
//			
//			Integer r = list.computeIfPresent(ch, (k, v) -> v + 1);
//			
//				if(r == null) {
//					list.put(ch, 1);
//				}
//				
//				
//		}
		
		Arrays.stream(cleanName.split(""))
			.map(s -> s.charAt(0))
			.forEach(ch -> {
				
				Integer r = list.computeIfPresent(ch, (k, v) -> v + 1);
				if(r == null) {
					list.put(ch, 1);
				}
				
			});
			
		
		System.out.println(list);
		
		
		
	}
	
}
