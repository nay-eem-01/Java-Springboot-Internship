package org.example.OOP.Problem09;

class FlatDiscount implements DiscountStrategy{

    private double amount;

    public FlatDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double originalPrice, int quantity) {
        return originalPrice*quantity - amount;
    }
}