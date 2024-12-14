package tech.sujith.practice.year24.dec.day14;

import java.io.IOException;

import reactor.core.publisher.Mono;
import tech.sujith.utils.SleepUtil;

public class CreateMonoFlux {
	public static void main(String[] args) {
		
		Mono.fromRunnable(() -> {
			SleepUtil.sleep(5);
		}).subscribe(s -> System.out.println(s));
		
		Mono.fromSupplier(() -> "Sujith Manchala").subscribe(name -> System.out.println(name));
		
		Mono.fromCallable(() -> 3).subscribe(name -> System.out.println(name));
		
		// Difference between Callable and Supplier?
	}
}
