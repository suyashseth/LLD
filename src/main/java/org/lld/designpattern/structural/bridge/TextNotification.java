package org.lld.designpattern.structural.bridge;

public class TextNotification implements NotificationImplementor {

    @Override
    public void notification() {
        System.out.println("Notifying by text");
    }
}
