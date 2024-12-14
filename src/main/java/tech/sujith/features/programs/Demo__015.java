package tech.sujith.features.programs;

import java.util.ArrayList;
import java.util.List;
// JVM ---> Start Demo__015.main() 
public class Demo__015 {
	public static void main(String[] args) {
		List<Integer> list2 = List.of(7, 3, 5, 1, 2, 1);
		ArrayList<Integer> list = new ArrayList<>(list2);
		
		List<Integer> list3 = list.stream().map(i -> i*i*i).filter(i  -> i > 50).toList();
		System.out.println(list3);
		
		
	}
}


// Employee {id, name, salary} <- Comparable
//  --> Natural order
// List<Employee>  --> Natural order, Default Comparator
// listEmployee.stream().sorted( (e1, e2 ) -> e2.getSal() - e1.getSal() )