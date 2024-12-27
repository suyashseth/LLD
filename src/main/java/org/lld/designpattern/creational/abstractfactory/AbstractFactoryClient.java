package org.lld.designpattern.creational.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        NotificationFactory factory = new SmsNotificationFactory();
        Notification notification = factory.getNotification();
        NotificationCarrier notificationCarrier = factory.getNotificationCarrier();
        notification.sendNotification();
        notificationCarrier.getNotificationCarrier();
        System.out.println();
        NotificationFactory factory1 = new MailNotificationFactory();
        Notification notification1 = factory1.getNotification();
        NotificationCarrier notificationCarrier1 = factory1.getNotificationCarrier();
        notification1.sendNotification();;
        notificationCarrier1.getNotificationCarrier();

    }
}
