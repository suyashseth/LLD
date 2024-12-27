package org.lld.designpattern.behavioural.observer;

public class SmsNotification implements OrderObserver {

    @Override
    public void update(OrderNotification notification) {
        System.out.println("Notifying user on sms for Order : " + notification);
    }
}
