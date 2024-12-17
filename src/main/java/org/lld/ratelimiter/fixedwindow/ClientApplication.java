package org.lld.ratelimiter.fixedwindow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientApplication {


    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateLimiterImpl(5);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                boolean b = rateLimiter.grantAccess();
                if (b) {
                    System.out.println("Thread :" + Thread.currentThread().getName() + " Request Granted : 200");
                } else {
                    System.out.println("Thread :" + Thread.currentThread().getName() + " Too many request : 429");
                }

            });
        }

        executorService.shutdown();

    }
}
