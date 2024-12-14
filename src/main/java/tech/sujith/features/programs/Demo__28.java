package tech.sujith.features.programs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Demo__28 {
	public static void main(String[] args) {
		int[] arr = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };

		// Calculate the total using IntStream and BigInteger
		// BigInteger total = Arrays.stream(arr).mapToObj(BigInteger::valueOf).reduce

		List<BigInteger> list = new ArrayList<>();
		for (int a : arr) {
			list.add(BigInteger.valueOf(a));
		}

		BigInteger bg = BigInteger.ZERO; // Identity
		
		for(BigInteger b : list) {
			 bg = bg.add(b); // Accumulator
		}
		
		System.out.println(bg);
		
		
		// T reduce(T identity, BinaryOperator<T> accumulator);
		// T reduce(T identity, BinaryOperator<T> accumulator);

		// System.out.println("Total: " + total);
	}
}
