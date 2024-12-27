package org.lld.designpattern.structural.bridge;

public class AudioNotification implements NotificationImplementor {

    @Override
    public void notification() {
        System.out.println("Notifying by audio");
    }
}
