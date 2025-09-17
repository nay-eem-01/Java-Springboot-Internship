package org.example.OOP.Problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<OrderLine> orderLines = new ArrayList<>();
        orderLines.add(new OrderLine("a",1,50));
        orderLines.add(new OrderLine("a",1,50));
        orderLines.add(new OrderLine("a",1,50));
        orderLines.add(new OrderLine("a",1,50));

        Order order1 = new Order(1L,orderLines);
        Order order2 = order1.deepClone();

        Order order3 = new Order(order1.orderId,order1);

        order1.orderLines.get(0).quantity = 5;

        System.out.println(order1.orderLines.get(0).quantity);
        System.out.println(order2.orderLines.get(0).quantity);
        System.out.println(order3.orderLines.get(0).quantity);
    }
}
