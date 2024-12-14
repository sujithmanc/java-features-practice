package tech.sujith.features.java15;

import java.util.List;

sealed class A permits B, C, D {
	// Error
}

final class B extends A {
	// Error : The class B with a sealed direct superclass or a sealed direct
	// super interface A should be declared either final, sealed, or non-sealed
}

non-sealed class C extends A {

}

sealed class D extends A permits E {
	// Sealed class or interface lacks the permits clause and no class or interface
	// from the same compilation unit declares D as its direct superclass or
	// super interface
}

final class E extends D {

}

class F extends C { // Okay

}

final class G { // The type G cannot subclass the final class E

}

public class SealedClasses {

	public void sealedClassesDemo() {
		System.out.println(new A() instanceof F); // false
		System.out.println(new F() instanceof A); // true
	}

	public void sealedClassesWithSwitch() {
		A a = new A();

	}

	public void patternChecking() {
		F f = new F();
		G g = new G();
//		if (f instanceof A a) {
//			System.out.println(a);
//		}
//
//		if (f instanceof A a) {
//			System.out.println(a);
//		}
	}

	public void getListTest() {
		List<Integer> list = null;
		for (Integer l : list) {

		}

	}
}