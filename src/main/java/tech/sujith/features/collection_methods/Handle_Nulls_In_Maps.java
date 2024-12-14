package tech.sujith.features.collection_methods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Handle_Nulls_In_Maps {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sujith", 50_000);
		map.put("Vin", 35_000);
		map.put("Richard", 75_000);
		map.put("Pragna", 60_000);
		map.put(null, null);

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		// Sort the keys in name wise
		entrySet.stream().sorted((e1, e2) -> {

			if (e1.getKey() == null || e2.getKey() == null) {
				return -1;
			}

			return e1.getKey().compareTo(e2.getKey());
		}).forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
		
		// Sort the values in name wise
		Map<String, Integer> map2 = entrySet.stream().sorted((e1, e2) -> {

			if (e1.getValue() == null) {
				return -1;
			}
			if (e2.getValue() == null) {
				return -1;
			}
			return e2.getValue().compareTo(e1.getValue());
		}

		).collect(Collectors.toMap(e -> e.getKey() == null ? null : e.getKey(),
				e -> e.getValue() == null ? 0 : e.getValue()));

		System.out.println(map2);

	}
}
