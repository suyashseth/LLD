package org.lld.designpattern.structural.bridge;

public class SmsNotification extends Notification {

    protected SmsNotification(NotificationImplementor notificationImplementor) {
        super(notificationImplementor);
    }

    @Override
    public void sendNotification() {
        notificationImplementor.notification();
    }
}
