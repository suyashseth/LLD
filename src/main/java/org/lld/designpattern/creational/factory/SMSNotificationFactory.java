package org.lld.designpattern.creational.factory;

public class SMSNotificationFactory implements NotificationFactory{

    @Override
    public Notification getNotificationInstance() {
        return new SMSNotification();
    }
}
