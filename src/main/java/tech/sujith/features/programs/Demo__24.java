package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Demo__24 {
	public static void main(String[] args) {
		// Find common prefix;
		List<String> list = new ArrayList(List.of("Floew", "Flow", "Floy"));

		final String fs = list.get(0);
		for (int i = 0; i < fs.length(); i++) {

			String sb = fs.substring(0, i);
			boolean allMatch = list.stream().allMatch(s -> s.startsWith(sb));
			if (!allMatch) {
				System.out.println("Common prefix: " + sb.substring(0, i - 1));
				break;
			}
		}
	}
}
