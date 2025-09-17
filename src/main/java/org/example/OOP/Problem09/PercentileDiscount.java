package org.example.OOP.Problem09;

class PercentileDiscount implements DiscountStrategy{

    private double percent;

    public PercentileDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double originalPrice, int quantity) {
        return originalPrice * quantity * (1- percent/100);
    }
}