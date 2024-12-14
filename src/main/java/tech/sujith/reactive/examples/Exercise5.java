package tech.sujith.reactive.examples;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import tech.sujith.sources.ReactiveSources;
import tech.sujith.utils.SleepUtil;

public class Exercise5 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

		// Subscribe to a flux using the error and completion hooks
		// TODO: Write code here
		
		ReactiveSources.intNumbersFlux()
		.subscribe(
					num -> System.out.println(num),
					err -> System.out.println(err),
					() -> System.out.println("Completion Event :P")
		);

		// Subscribe to a flux using an implementation of BaseSubscriber
		// TODO: Write code here
		
		ReactiveSources.intNumbersFlux().subscribe(new MySubscriber());


		System.out.println("Press a key to end");
		System.in.read();
	}

}

class MySubscriber<T> extends BaseSubscriber<T> {

	@Override
	protected void hookOnSubscribe(Subscription subscription) {
		System.out.println("Subscrption Happened:)");
		request(2); // Subscriber okay to handle 2 items

	}

	@Override
	protected void hookOnNext(T value) {
		System.out.println("hookOnNext::Value Received:" + value);
		SleepUtil.sleep(1, 3);
		request(1);
	}

	@Override
	protected void hookOnComplete() {
		System.out.println("hookOnComplete::Completed");
	}

	@Override
	protected void hookOnError(Throwable throwable) {
		// TODO Auto-generated method stub
		super.hookOnError(throwable);
	}

	@Override
	protected void hookOnCancel() {
		// TODO Auto-generated method stub
		super.hookOnCancel();
	}

}