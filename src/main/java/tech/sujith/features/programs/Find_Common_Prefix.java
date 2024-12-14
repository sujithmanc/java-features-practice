package tech.sujith.features.programs;

import java.util.List;
import java.util.stream.Collectors;

public class Find_Common_Prefix {
	 public static void main(String[] args) {
	      
	      // Find the largest String
	      List<String> list = List.of("Flooy", "Flow","Floee");
	      
	      
	      list = list.stream().sorted( (s1, s2) -> s1.length() - s2.length())
	          .collect(Collectors.toList());
	      
	      String str = list.get(0);
	      list.remove(0);
	      
	      // loop every Character 
	      for(int i = 0;i < str.length();i++){
	        
	        String sub = str.substring(0, i);
	        long count = list.stream().filter(s -> s.startsWith(sub)).count();
	        if(count == list.size()){
	          System.out.println(sub);
	        }
	        
	      }
	      
	      
	      // Count first letter match of the remainting all the list elements
	     
	    }
}
