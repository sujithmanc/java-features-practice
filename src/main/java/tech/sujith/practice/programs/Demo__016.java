package tech.sujith.practice.programs;

import java.util.ArrayList;
import java.util.List;

public class Demo__016 {
	public static void main(String[] args) {
		int arr[] = {2,4,5,6,8,3,4,5,0,1,2,3,4,5,6,7,8,9,0,-1,-2,8,6};
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i< arr.length - 1; i++) {
			
			while(arr[i] < arr[i + 1]) { 
				list.add(arr[i]);
				i++;
			}
			
			list.add(arr[i]);
			
			System.out.println(list);
			list.clear();
			// 2, 4,5,6,8
			// 3,4,5
			// 0,1,2,3,
		}
		
		
	}
	
}
