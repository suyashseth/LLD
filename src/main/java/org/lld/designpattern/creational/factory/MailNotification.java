package org.lld.designpattern.creational.factory;

public class MailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Notifying via Email");
    }
}
