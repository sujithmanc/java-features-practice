package tech.sujith.practice.java08;

interface DoSomething {
	int apply(int name);
}

public class FunctionalInterfaceDemo01 {
	public static void main(String[] args) {
		DoSomething d = i -> i + 1;
		System.out.println(d.apply(45454));
	}
}

