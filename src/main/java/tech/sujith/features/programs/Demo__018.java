package tech.sujith.features.programs;

public class Demo__018 {
	public static void main(String[] args) {
		// Find the 2 max number
		int arr[] = {5,4,6,78,43,2,3,55,70};
	
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] > max) { // 15
				smax = max; // 10
				max = arr[i]; // 20
			}else if(arr[i] > smax && arr[i] != max) { 
				smax = arr[i];
			}
		}
		System.out.printf(" Max : %d, 2nd Max %d ", max, smax);
	}
	
	
}
