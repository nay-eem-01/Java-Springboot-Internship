package org.example.OOP.Problem7;

import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {
     Long orderId;
     List<OrderLine> orderLines;

    // default all arg constructor
    public Order(Long orderId, List<OrderLine> orderLines) {
        this.orderId = orderId;
        this.orderLines = orderLines;
    }

    // shallow copy
    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    // copy constructor
    public Order(Long orderId, Order order) {
        this.orderId = orderId;
        this.orderLines = new ArrayList<>();
        for (OrderLine orderLine : order.orderLines){
            this.orderLines.add(orderLine.clone());
        }
    }



    public Order deepClone() {
        try {
            Order deepClone = (Order) super.clone();
            deepClone.orderLines = new ArrayList<>();

            for (OrderLine orderLine : this.orderLines){
                deepClone.orderLines.add(orderLine.clone());
            }
            return deepClone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
