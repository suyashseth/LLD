package org.lld.designpattern.structural.bridge;

public abstract class Notification {

    public abstract void sendNotification();

    protected NotificationImplementor notificationImplementor;

    protected Notification(NotificationImplementor notificationImplementor) {
        this.notificationImplementor = notificationImplementor;
    }

}
