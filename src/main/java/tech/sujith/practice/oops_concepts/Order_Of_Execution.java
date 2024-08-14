package tech.sujith.practice.oops_concepts;

public class Order_Of_Execution {
	public static void main(String[] args) {
		D d = new D();
		System.out.println();
		
		D d1 = new D();
		System.out.println();
		D d2 = new D();
		System.out.println();
		D d3 = new D();
	}
}

class D {
	
	private final Integer value;
	
	{
		System.out.println("Non static block 1");
		value = 123;
	}

	static {
		System.out.println("Static block 1");
	}

	{
		System.out.println("Non static block 2");
	}

	static {
		System.out.println("Static block 2");
	}

	public D() {
		System.out.println("Constructor :" + value);
	}

}
