package tech.sujith.features.oops_concepts;

class A {
	public void m1() throws ClassNotFoundException {
		System.out.println("m1 in A");
	}

}

class B extends A {

	@Override
	public void m1() {
		System.out.println("m1 in B");
	}
}

public class Basic__001 {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		A a1 = new A();
		b.m1();

	}
}
