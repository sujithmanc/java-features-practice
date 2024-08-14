package tech.sujith.practice.collection_methods;

import lombok.ToString;
import tech.sujith.practice.dto.Employee;

public class ClonableDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		C c  = new C();
		c.age = 27;
		c.name = "Hello";
		c.emp = new Employee(0, null, null);
		
		C clone = (C) c.clone();
		System.out.println(clone);
		clone.emp.setName("Sujith");
		System.out.println(c);
		
		
	}
}


@ToString
class C implements Cloneable{
	String name;
	int age;
	Employee emp;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
}
