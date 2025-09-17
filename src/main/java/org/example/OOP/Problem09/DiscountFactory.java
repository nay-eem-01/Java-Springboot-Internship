package org.example.OOP.Problem09;

public class DiscountFactory {

    public static DiscountStrategy getDiscountStrategy(String discountType ,double value){
        return switch (discountType.toUpperCase()){
            case "PERCENT" -> new PercentileDiscount(value);
            case "FLAT" -> new FlatDiscount(value);
            case "BOGO" -> new BOGODiscount();
            default -> throw new IllegalArgumentException("Invalid discount type");
        };
    }
}
