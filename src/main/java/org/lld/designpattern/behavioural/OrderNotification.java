package org.lld.designpattern.behavioural;

import java.util.ArrayList;
import java.util.List;


//This class is Observable
public class OrderNotification {

    private String orderId;

    private OrderStatus orderStatus;

    private final List<OrderObserver> observers = new ArrayList<>();

    //Setting observer based on the order status
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        if (orderStatus == OrderStatus.CONFIRMED) {
            observers.forEach(observer -> observer.update(this));
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "OrderNotification{" +
                "orderId='" + orderId + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
