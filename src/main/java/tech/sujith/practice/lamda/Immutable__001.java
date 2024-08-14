package tech.sujith.practice.lamda;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
final class Imm {
	private final int id;
	private final String name;
	
	private Imm() {
		id = 0;
		name = "Sujith";
	}
	
	
}

public class Immutable__001 {
	public static void main(String[] args) {
		Imm m = new Imm(12, "Vineeth");
		Comparable c;
		Comparator c2;
	}
}
