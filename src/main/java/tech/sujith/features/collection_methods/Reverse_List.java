package tech.sujith.features.collection_methods;

import java.util.LinkedList;

public class Reverse_List {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);

		System.out.println(ll);

		
		LinkedList<Integer> ll1 = new LinkedList<>();

		ll.descendingIterator().forEachRemaining(ll1::add);
	
		//ll.forEach(ll1::add);
		
		
		System.out.println(ll1);
	}
}
