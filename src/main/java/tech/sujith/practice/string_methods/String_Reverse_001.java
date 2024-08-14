package tech.sujith.practice.string_methods;

public class String_Reverse_001 {
	public static void main(String[] args) {
		String name = "Sujith";
		StringBuilder sb = new StringBuilder(name);

		// WAY #1 Using StringBuilder
		System.out.println("WAY #1: " + sb.reverse());

		// WAY #2 Using StringBuilder using double pointer
		StringBuilder sb2 = new StringBuilder(name);

		int s = 0, e = name.length() - 1;
		while (s < e) {
			
			// Swapping two variables in StringBuilder
			char ch = sb2.charAt(s);
			sb2.setCharAt(s++ , sb2.charAt(e));
			sb2.setCharAt(e-- , ch);
//			s++;
//			e--;
		}
		System.out.println("WAY #2: " + sb2.toString());
	}
}
