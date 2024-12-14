package tech.sujith.features.collection_methods;

public class Demo__001 {
	public static void main(String[] args) {
		// 0 ,1 , 1, 2, 3, 5, 8...
		//                    
		// 100, 100 - 99, 99 - 98
		// 89, 54, 34, 21, 13
		// 55, 
		int pre = 89;
		int prev = 55;
		
		while(pre > 0) { // 89, 55, 34
			
			
			int num = pre - prev; // 89- 54 // 54 34
			System.out.println(num); // 35

			pre = prev;  // 
			prev = num; // 
			
			
		}
		
		
	}
}
