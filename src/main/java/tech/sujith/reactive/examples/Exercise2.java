package tech.sujith.reactive.examples;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()
    	
    	
        // Print all numbers in the ReactiveSources.intNumbersFlux stream
    	ReactiveSources.intNumbersFlux().subscribe(num -> System.out.println(num));
    	
        // Print all users in the ReactiveSources.userFlux stream
    	ReactiveSources.userFlux().subscribe(num -> System.out.println(num));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
