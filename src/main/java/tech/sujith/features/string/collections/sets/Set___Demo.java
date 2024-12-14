package tech.sujith.features.string.collections.sets;

import java.util.HashSet;
import java.util.Set;

import tech.sujith.features.dto.BoxDto;

public class Set___Demo {
	public static void main(String[] args) {
		BoxDto b = new BoxDto(3);
		BoxDto b1 = new BoxDto(13);
		BoxDto b2 = new BoxDto(3);
		BoxDto b3 = new BoxDto(14);
		BoxDto b4 = new BoxDto(12);
		BoxDto b5 = new BoxDto(10);
		BoxDto b6 = new BoxDto(10);
		BoxDto b7 = new BoxDto(3);
	
		try {
			// var boxSet = Set.of(b, b2, b3, b4, b5, b6, b7);			
			// Note : of method throws exception when it finds an duplicate element
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}

		System.out.println("Unique Elements:\n\n\n");
		var boxSet2 = new HashSet<BoxDto>();
		boxSet2.add(b);
		boxSet2.add(b1);
		boxSet2.add(b2);
		boxSet2.add(b3);
		boxSet2.add(b4);
		boxSet2.add(b5);
		boxSet2.add(b6);
		boxSet2.add(b7);
		
		boxSet2.forEach(e -> System.out.println(e));
	}
}
