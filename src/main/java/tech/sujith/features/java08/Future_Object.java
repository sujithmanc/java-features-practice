package tech.sujith.features.java08;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Future_Object {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Future<Integer> f1 = new FutureTask<>(() -> 5454);

		ExecutorService executor = Executors.newFixedThreadPool(10);
		
//		ExecutorService executorService = 
//				  new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,   
//				  new LinkedBlockingQueue<Runnable>());
		
		
		// ExecutorService can execute Runnable and Callable tasks.
		
		Runnable runnableTask = () -> {
		    try {
		        TimeUnit.MILLISECONDS.sleep(300);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Callable<String> callableTask = () -> {
		    for(int i = 0;i < 10; i++) {
		    	System.out.println("Ex1 - "+i);
		    }
		    return "Task's execution";
		};
		
		Callable<String> callableTask2 = () -> {
		    for(int i = 0;i < 10; i++) {
		    	System.out.println("Ex2 - "+i);
		    }
		    return "Task's execution";
		};
		
		
		System.out.println("Main thread...");

		Future<String> submit = executor.submit(callableTask);
		Future<String> submit2 = executor.submit(callableTask2);
		System.out.println("Main thread invoking  1...");
		//System.out.println(submit.get());
		System.out.println("Main thread invoking 2...");
		//System.out.println(submit2.get());
		System.out.println("Main thread...");
		

	}
}
