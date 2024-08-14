package tech.sujith.practice.string.collections.sets;

import java.util.Comparator;
import java.util.TreeSet;

import tech.sujith.practice.dto.BoxDto;
import tech.sujith.practice.dto.DotDto;

public class TreeSet___Demo {
	
	public static void main(String[] args) {
		DotDto b = new  DotDto(3, 4);
		DotDto b1 = new DotDto(3,7);
		DotDto b2 = new DotDto(3,4);
		DotDto b3 = new DotDto(3,13);
		DotDto b4 = new DotDto(12,4);
		DotDto b5 = new DotDto(3,7);
		DotDto b6 = new DotDto(3,4);
		DotDto b7 = new DotDto(4,34);
		
		//	var treeSet = new TreeSet<BoxDto>(Comparator.comparingInt(BoxDto::getValue).reversed());
		// 	var treeSet = new TreeSet<BoxDto>(((x, y) -> x.getValue() - y.getValue()));
		var treeSet = new TreeSet<DotDto>(Comparator.comparingInt(DotDto::getX).thenComparing(Comparator.comparingInt(DotDto::getY)));
		treeSet.add(b);
		treeSet.add(b1);
		treeSet.add(b2);
		treeSet.add(b3);
		treeSet.add(b4);
		treeSet.add(b5);
		treeSet.add(b6);
		treeSet.add(b7);
		
		treeSet.forEach(e -> System.out.println(e));
	}
}
