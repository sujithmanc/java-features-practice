package tech.sujith.features.collection_methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo__003 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of( 1, 2, 3, 4, 5, 6));
		System.out.println(list);
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			Integer next = i.next();
			if (next == 4) {
				i.remove();
				System.out.println(i.next());
			}
		}
		System.out.println(list);
	}
}
