package tech.sujith.practice.mutli_threading.future;
import java.util.concurrent.*;

public class FutureVsCompletableFutureExample {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Using Future
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(2000); // Simulating a time-consuming task
            return 42;
        });

        // Blocking call - waits until the result is available
        int result = future.get();
        System.out.println("Future result: " + result);

        executorService.shutdown();

        // Using CompletableFuture
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulating a time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        // Non-blocking call - attaches a callback to execute when the result is available
        completableFuture.thenAcceptAsync(value -> System.out.println("CompletableFuture result: " + value));

        // Doing other tasks while waiting for CompletableFuture to complete
        System.out.println("Carrying on with other tasks while waiting...");

        // Delaying the termination of the main thread to allow CompletableFuture to complete
        Thread.sleep(3000);
    }
}
