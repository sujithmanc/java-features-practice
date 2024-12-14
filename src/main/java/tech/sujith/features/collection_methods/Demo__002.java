package tech.sujith.features.collection_methods;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo__002 {
	public static void main(String[] args) {
//		System.out.println( 1 ^ 0); // 1
//		System.out.println( 0 ^ 1); // 1
//		System.out.println( 0 ^ 0); // 0
//		System.out.println( 2 ^ 1); // 0
		
		for(int i = 0;i<5;i++) {
			for(int j = 1;j<100;j++) {
				System.out.printf("%d %% %d = %d %n",i,j,i%j);
			}
		}
		
		Map<Integer, Integer> of = Map.of(1, 1);
		Set<Entry<Integer, Integer>> entrySet = of.entrySet();
		
		entrySet.stream().max((e1, e2 ) -> e1.getValue() - e2.getValue()).get().getKey();
		
	}
}
