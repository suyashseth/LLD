package org.lld.designpattern.creational.abstractfactory;

public class ComputerNotification implements NotificationCarrier {

    @Override
    public void getNotificationCarrier() {
        System.out.println("Notifying user via Computer");
    }
}
