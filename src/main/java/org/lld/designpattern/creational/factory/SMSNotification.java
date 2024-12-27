package org.lld.designpattern.creational.factory;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Notifying via SMS");
    }
}
