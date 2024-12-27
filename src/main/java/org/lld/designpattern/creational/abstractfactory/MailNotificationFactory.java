package org.lld.designpattern.creational.abstractfactory;

public class MailNotificationFactory implements NotificationFactory {

    @Override
    public Notification getNotification() {
        return new MailNotification();
    }

    @Override
    public NotificationCarrier getNotificationCarrier() {
        return new ComputerNotification();
    }

}
