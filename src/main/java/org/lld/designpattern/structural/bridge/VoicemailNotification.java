package org.lld.designpattern.structural.bridge;

public class VoicemailNotification extends Notification {

    protected VoicemailNotification(NotificationImplementor notificationImplementor) {
        super(notificationImplementor);
    }

    @Override
    public void sendNotification() {
        notificationImplementor.notification();
    }
}
