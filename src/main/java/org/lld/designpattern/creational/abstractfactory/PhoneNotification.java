package org.lld.designpattern.creational.abstractfactory;

public class PhoneNotification implements NotificationCarrier {

    @Override
    public void getNotificationCarrier() {
        System.out.println("Notifying user via mobile phone");
    }
}
