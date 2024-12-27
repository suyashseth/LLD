package org.lld.designpattern.creational.factory;

public class FactoryClient {

    public static void main(String[] args) {

        NotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.getNotificationInstance();
        notification.sendNotification();

        NotificationFactory factory1 = new MailNotificationFactory();
        Notification notification1 = factory1.getNotificationInstance();
        notification1.sendNotification();

    }
}
