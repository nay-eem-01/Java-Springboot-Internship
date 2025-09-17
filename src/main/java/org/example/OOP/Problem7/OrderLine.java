package org.example.OOP.Problem7;

public class OrderLine implements Cloneable{
    String productName;
    int quantity;
    double price;

    public OrderLine(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }


    @Override
    public OrderLine clone() {
        try {
            return  (OrderLine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
