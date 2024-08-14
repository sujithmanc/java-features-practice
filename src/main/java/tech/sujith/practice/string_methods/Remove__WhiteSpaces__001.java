package tech.sujith.practice.string_methods;

public class Remove__WhiteSpaces__001 {
	public static void main(String[] args) {
		
		// Remove double white spaces
		String str = " Java    is       not      a   bad   programming   language  ";
		str = str.trim();
		
		for(int i = 0 ;i < str.length() ; i++) {
			
			boolean findSpace = false;
			while(str.charAt(i) == ' ') {
				i++;
				findSpace = true;
			}
			if(findSpace) {
				System.out.print(" ");	
			}
			
			System.out.print(str.charAt(i));
		}
		
		
	}
}
