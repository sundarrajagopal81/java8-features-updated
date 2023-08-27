package src.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * CompletableFuture provides a powerful and flexible way to write asynchronous, non-blocking code in Java.
 * We can use it to compose multiple asynchronous operations, handle errors and exceptions, and combine multiple
 * CompletableFutures into one. By using CompletableFuture, we can write more efficient and
 * scalable code that can take advantage of multi-core processors and handle complex asynchronous workflows.
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // System.out.println(completableFuture.get());
        System.out.println(completableFuture.getNow("abcde...")); //default value
        completableFuture.complete("Sundar");
        System.out.println("####################>" + completableFuture.get());


        /**
         * Run Async
         * Supply Async
         *
         *
         */

        System.out.println("Main Thread...:" + Thread.currentThread().getName());
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Future Thread: " + Thread.currentThread().getName());
        });
        System.out.println(" runAsync FUTURE.get::" + future.get());
        System.out.println("############################################");

        System.out.println("Main Thread...:::" + Thread.currentThread().getName());


        CompletableFuture<String> futureObj = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                return "FUTURE Thread: supplyAsync " + Thread.currentThread().getName();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        System.out.println("supply Async ::" + futureObj.get());

        System.out.println("THEN Apply method.............");
        // Then Apply method...
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(
                        () -> "Like and ").thenApply(supplyResult -> supplyResult + "Subscribe to ")
                .thenApply(thenApplyResult -> thenApplyResult + " SUNDAR !!!");
        System.out.println("CompletableFuture...supplyAsync,thenApply--> ," + completableFuture1.get());


        //then apply and accept method...

        System.out.println("Then apply and accept method....");

        CompletableFuture.supplyAsync(
                        () -> "Like and ")
                .thenApply(supplyResult -> supplyResult + "Subscribe")
                .thenAccept(thenApplyResult -> System.out.println(thenApplyResult + "!!!")).get();


    }
}
