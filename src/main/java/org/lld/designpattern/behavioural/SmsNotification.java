package org.lld.designpattern.behavioural;

public class SmsNotification implements OrderObserver {

    @Override
    public void update(OrderNotification notification) {
        System.out.println("Notifying user on sms");
    }
}
