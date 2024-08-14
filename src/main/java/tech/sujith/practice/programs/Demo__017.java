package tech.sujith.practice.programs;

import java.util.Collections;
import java.util.List;

final class A {
	private final List<Integer> list;

	
	public A(List<Integer> list) {
		Collections.unmodifiableCollection(list);
		this.list = list;
	}
	
	public List<Integer> getList(){
		return list;
	}
	
	
	
	
	
}

public class Demo__017 {
	public static void main(String[] args) {
		
	}
}
