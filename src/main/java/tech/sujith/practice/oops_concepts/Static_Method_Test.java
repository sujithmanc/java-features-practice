package tech.sujith.practice.oops_concepts;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Static_Method_Test {
	public static void main(String[] args) {

		Random r = new Random();

		WeakHashMap<Integer, Integer> collect = r.ints(10, 1000, 2000).boxed()
				.collect(Collectors.toMap(Function.identity(), val -> 10, (ex, rp) -> ex, WeakHashMap::new));

		LinkedHashSet<Integer> collect2 = r.ints(10, 100,1000).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
		
		
		
	}

}
