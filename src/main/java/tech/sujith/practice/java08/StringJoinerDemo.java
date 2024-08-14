package tech.sujith.practice.java08;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		//stringJoinerWithPreAndPostFix();
		joinComplext();
	}

	public static void simpleJoiner() {
		StringJoiner sj = new StringJoiner("\n");
		sj.add("Hello");
		sj.add("This");
		sj.add("Is");
		sj.add("Sujith");

		System.out.println(sj);
	}

	public static void stringJoinerWithPreAndPostFix() {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);
	}
	
	public static void joinComplext() {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
  
        // Creating StringJoiner with :(colon) delimiter  
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
  
        // Merging two StringJoiner  
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  
	}
}
