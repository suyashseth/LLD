package org.lld.designpattern.behavioural.observer;

public class Client {

    public static void main(String[] args) {

        OrderNotification notification = new OrderNotification();

        OrderObserver observer = new EmailNotification();
        OrderObserver observer1 = new SmsNotification();

        notification.addObserver(observer);
        notification.addObserver(observer1);

        notification.setOrderId("1");
        notification.setOrderStatus(OrderStatus.CONFIRMED);


    }
}
