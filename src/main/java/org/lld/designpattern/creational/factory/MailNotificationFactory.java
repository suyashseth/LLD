package org.lld.designpattern.creational.factory;

public class MailNotificationFactory implements NotificationFactory {

    @Override
    public Notification getNotificationInstance() {
        return new MailNotification();
    }
}
