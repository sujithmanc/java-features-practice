package tech.sujith.practice.java08;

interface X {
	public default void m1() {
		System.out.println("X M1");
	}
}

interface Y {
	public default void m1() {
		System.out.println("Y M1");
	}
}

class Z implements X, Y {

	@Override
	public void m1() {
		X.super.m1();
		Y.super.m1();
		System.out.println("Name: " + X.class.getCanonicalName());
	}
}

public class Static_Interface_Demo {
	public static void main(String[] args) {
		Z z = new Z();
		z.m1();
	}
}
