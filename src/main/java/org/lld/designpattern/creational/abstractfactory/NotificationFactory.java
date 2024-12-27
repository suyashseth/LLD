package org.lld.designpattern.creational.abstractfactory;

public interface NotificationFactory {

    Notification getNotification();
    NotificationCarrier getNotificationCarrier();

}
