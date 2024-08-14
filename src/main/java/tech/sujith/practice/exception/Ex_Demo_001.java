package tech.sujith.practice.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Ex_Demo_001 {
	
	static {
		System.out.println("I am Static Block");
	}
	
	{
		System.out.println("I am Non-Static Block");
	}
	
	public Ex_Demo_001() {
		System.out.println("I am Constructor");
	}
	
	
	public static void main(String[] args) {
		
		Ex_Demo_001 a = new Ex_Demo_001();
		Ex_Demo_001 a1 = new Ex_Demo_001();
		Ex_Demo_001 a2 = new Ex_Demo_001();
		Ex_Demo_001 a3 = new Ex_Demo_001();

		

		
	}
}
