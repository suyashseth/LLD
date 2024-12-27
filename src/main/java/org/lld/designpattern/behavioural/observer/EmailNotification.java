package org.lld.designpattern.behavioural.observer;

public class EmailNotification implements OrderObserver {

    @Override
    public void update(OrderNotification notification) {
        System.out.println("Notifying user on email for Order : " + notification);
    }
}
