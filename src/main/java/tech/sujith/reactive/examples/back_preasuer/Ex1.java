package tech.sujith.reactive.examples.back_preasuer;

import java.io.IOException;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;
import tech.sujith.utils.SleepUtil;

public class Ex1 {
	public static void main(String[] args) throws IOException {
//		ReactiveSources.intNumbersFlux().subscribe(num -> {
//			SleepUtil.sleep(2);
//			System.out.println(num);
//		});
		
		Flux.fromStream(Stream.of(1,3,4,4,5,5,6,67,7,7,7,7)).log().subscribe(num -> {
			SleepUtil.sleep(2);
			System.out.println(num);
		});
		
		System.in.read();
	}
}
