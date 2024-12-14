package tech.sujith.features.java08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import tech.sujith.features.dto.Xyz;

interface I {
	int sqr(int n);
}

interface J {
	A getA();
}

@FunctionalInterface
interface K<T> {
	T getT();
}

@FunctionalInterface
interface L<T> {
	T getL(T t);
}

class B {
	public B getInstance() {
		return new B();
	}
}

class A {

	public A() {

	}

	public Xyz getX() {
		return new Xyz(34);
	}

	static int add(int n) {
		return n + n;
	}

	static int pow3(int n) {
		return n * n * n;
	}

	static int sqr(int n) {
		return n * n;
	}

	int cube(int n) {
		return n * n * n;
	}
}

public class MethodReferences {

	public static void main(String... args) {
		var methodRef = new MethodReferences();
		methodRef.referenceToAnInstanceMethod();
		methodRef.methodRefDemo1();
	}

	public void staticMethodRef() {
		// I i = new I(); Error
		I inf = A::pow3; // Providing implementation
		int ans = inf.sqr(3);
		System.out.println("Ans: " + ans);
	}

	public void staticRef() {

		K<Xyz> k = () -> new Xyz(100);
		// K<Xyz> k2 = A::getX; Cannot make a static reference to the non-static method
		// getX() from the type A

		K<B> kb = () -> new B();
		K<B> kb2 = B::new;

		// L<B> lb = () -> new B();Error
		L<B> lb = B::getInstance;
		L<B> lb2 = b -> b.getInstance();

	}

	public void instanceMethodRef() {
		A a = new A();
		I inf = a::cube; // Only instance method are valid here
		int ans = inf.sqr(3);
		System.out.println("Ans: " + ans);
	}

	public void refToConstructor() {
		J j = A::new;
		A a = j.getA();
		System.out.println("Result: " + a);

	}

	public void referenceToAnInstanceMethod() {
		List<Xyz> list = List.of(new Xyz(3434), new Xyz(785), new Xyz(965));
		var list2 = new ArrayList<Xyz>(list);

		Function<Xyz, ?> f = x -> x.getInstance();
		Function<Xyz, ?> f2 = Xyz::getInstance;

		// Type::instance Method
		List<Integer> list3 = list2.stream().map(Xyz::getInstance).toList();
		System.out.println(list3);

		// Type:: you can't access static method
		List<Integer> list4 = list2.stream().map(u -> Xyz.getStastic()).toList();
		System.out.println(list3);

//	 		Type:: you can't access static method
//			List<Integer> list5 = list2.stream().map(Xyz::getStastic).toList();
//			System.out.println(list3);

		List<Integer> list5 = List.of(234, 983, 123, 876, 453, 683, 533);

		// Reference constructor
		List<Xyz> list6 = list5.stream().map(Xyz::new).toList();
		System.out.println(list6);
	}

	public void methodRefDemo1() {
		var list = new ArrayList<Integer>(List.of(33, 54, 23, 12, 87));
		int sal = 5000;
		list.forEach(e -> e = e + sal);

		System.out.println(list);
	}

}
