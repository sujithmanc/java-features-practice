package tech.sujith.practice.programs;

public class Demo__009 {
	public static void main(String[] args) {
		String str = "sujith334@gmail.343com";
		// Remove special characters and numbers
		
		String s = str.replaceAll("[^a-zA-Z]+", "");
		System.out.println(s);
	}
}
