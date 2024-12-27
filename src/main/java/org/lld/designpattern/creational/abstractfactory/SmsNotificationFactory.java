package org.lld.designpattern.creational.abstractfactory;

public class SmsNotificationFactory implements  NotificationFactory {

    @Override
    public Notification getNotification() {
        return new SmsNotification();
    }

    @Override
    public NotificationCarrier getNotificationCarrier() {
        return new PhoneNotification();
    }
}
