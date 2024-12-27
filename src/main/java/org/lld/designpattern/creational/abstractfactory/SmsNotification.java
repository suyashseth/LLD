package org.lld.designpattern.creational.abstractfactory;

public class SmsNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Notifying via SMS");
    }
}
