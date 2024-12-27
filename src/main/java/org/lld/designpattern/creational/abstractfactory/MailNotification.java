package org.lld.designpattern.creational.abstractfactory;

public class MailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Notifying via Email");
    }
}
