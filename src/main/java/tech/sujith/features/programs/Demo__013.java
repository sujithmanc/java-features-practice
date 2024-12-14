package tech.sujith.features.programs;

public class Demo__013 {
	public static void main(String[] args) {
		// Find the long consequitive occurance find start and end indexes
		String str = "aaasssrrrrrrreewwesfsssdfdfdfffdfdfdzzzzzzzzfdfdfdfdfkkkkkkererrrrrrrrrrrrrrrrrr";

		int s = 0, e = 0; int max = Integer.MIN_VALUE;
		for (int i = 0; i < str.length() - 1; ) {
			// 03:04 Started

			char ch = str.charAt(i); // 0
			int j = i;
			int count = 0;
			while ( str.length() - 1 > j && ch == str.charAt(++j)) { //
				count++;
			}
			
			if(count > max) {
				max = count;
				s = i;
				e = j;
			}
			
			i = j;

		}
		
		System.out.printf("%d %d %s", s, e, str.substring(s, e));
		
		
	}

}
