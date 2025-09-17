package org.example.OOP.Problem09;

public class DiscountEngine {
    double calculatePrice(double price, int quantity, double value, String discountType) {
        DiscountStrategy strategy = DiscountFactory.getDiscountStrategy(discountType, value);
        return strategy.applyDiscount(price, quantity);
    }

    public static void main(String[] args) {
        DiscountEngine  discountEngine = new DiscountEngine();

        System.out.println(discountEngine.calculatePrice(100,2,25,"PERCENT"));
        System.out.println(discountEngine.calculatePrice(100,2,25,"FLAT"));
        System.out.println(discountEngine.calculatePrice(100,2,0,"BOGO"));
    }
}
