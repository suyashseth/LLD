package org.lld.ratelimiter.fixedwindow;

public interface RateLimiter {

    boolean grantAccess();
}
