package org.lld.ratelimiter.fixedwindow;

import java.util.concurrent.atomic.AtomicInteger;

public class RateLimiterImpl implements RateLimiter {

    private final int threshold;
    private volatile long windowStartTime;
    private long fixedWindow = 1000L;
    private final AtomicInteger counter = new AtomicInteger();

    public RateLimiterImpl(int threshold) {
        this.threshold = threshold;
        windowStartTime = System.currentTimeMillis();
    }

    @Override
    public boolean grantAccess() {

        long currentTime = System.currentTimeMillis();

        if (currentTime - windowStartTime >= fixedWindow) {
            //Re checking to avoid race condition in multi threading env
            if (currentTime - windowStartTime >= fixedWindow) {
                windowStartTime = System.currentTimeMillis();
                counter.set(0);
            }
        }

        return counter.incrementAndGet() <= threshold;
    }
}
