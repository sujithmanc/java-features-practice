package tech.sujith.features.streams;

import java.util.stream.Stream;

public class Fibonnaci_Series_Streams {
	public static void main(String[] args) {

		// Print one to 10 numbers using Streams
		Stream.iterate(1, i -> i + 1).limit(10).forEach(e -> System.out.println(e));

		Stream.iterate(0, i -> i + 2).limit(10).forEach(e -> System.out.println(e));
		
	
	}
}
