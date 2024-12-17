package org.lld.ratelimiter.slidingwindow;

import org.lld.ratelimiter.fixedwindow.RateLimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientApp {

    public static void main(String[] args) throws InterruptedException {

        RateLimiter rateLimiter = new SlidingRateLimiterImpl(2);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            executorService.execute(() -> {
                boolean b = rateLimiter.grantAccess();
                if (b) {
                    System.out.println("Thread :" + Thread.currentThread().getName() + " Request Granted : 200");
                } else {
                    System.out.println("Thread :" + Thread.currentThread().getName() + " Too many request : 429");
                }

            });
        }




    }
}
