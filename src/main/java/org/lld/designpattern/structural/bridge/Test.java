package org.lld.designpattern.structural.bridge;

public class Test {

    public static void main(String[] args) {

     Notification notification = new SmsNotification(new TextNotification());
     notification.sendNotification();

     Notification notificatio1 = new VoicemailNotification(new AudioNotification());
     notificatio1.sendNotification();

    }
}
