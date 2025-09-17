package org.example.OOP.Problem09;

class BOGODiscount implements DiscountStrategy{


    @Override
    public double applyDiscount(double originalPrice, int quantity) {

        int payableQuantity = quantity/2 + quantity%2;

        return originalPrice*payableQuantity;
    }
}