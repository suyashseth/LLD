package org.lld.designpattern.behavioural;

public class EmailNotification implements OrderObserver {

    @Override
    public void update(OrderNotification notification) {
        System.out.println("Notifying user on email");
    }
}
