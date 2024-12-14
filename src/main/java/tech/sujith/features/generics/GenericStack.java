package tech.sujith.features.generics;

public class GenericStack {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(234);
		Box<String> b2 = new Box<>("Sujith");
		Box<Double> b3 = new Box<>(2.545);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
