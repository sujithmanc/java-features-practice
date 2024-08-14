package tech.sujith.practice.string_methods;

import java.util.ArrayList;
import java.util.List;

public class Find_Multipliers {
	public static void main(String[] args) {
		int n = 725;
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n ; i++) {
			if( n % i == 0) {
				int temp =  n / i;
				if(temp < i) {
					break;
				}else {
					list.add(temp);
					list.add(i);	
				}
			}
		}
		System.out.println(list);
	}
}
