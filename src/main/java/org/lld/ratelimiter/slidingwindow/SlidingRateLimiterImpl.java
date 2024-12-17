package org.lld.ratelimiter.slidingwindow;

import org.lld.ratelimiter.fixedwindow.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingRateLimiterImpl implements RateLimiter {

    private final Queue<Long> queue;
    private long windowTime = 5;
    private final int bucketCapacity;


    public SlidingRateLimiterImpl(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
        queue = new ConcurrentLinkedQueue<>();
    }


    @Override
    public boolean grantAccess() {
        long currentTimeMillis = System.currentTimeMillis();
        checkAndUpdateQueueCapacity(currentTimeMillis);
        if (queue.size() <= bucketCapacity) {
            queue.offer(currentTimeMillis);
            return true;
        }
        return false;
    }

    private void checkAndUpdateQueueCapacity(long currentTimeMillis) {
        if (queue.isEmpty()) return;
        long currectWindowTime = (currentTimeMillis - queue.peek()) / 1000;
        while (currectWindowTime >= windowTime) {
            queue.poll();
            if (queue.isEmpty()) break;
            currectWindowTime = (currentTimeMillis - queue.peek()) / 1000;
        }
    }
}
