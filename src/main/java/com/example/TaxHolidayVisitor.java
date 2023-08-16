package com.example;

public class TaxHolidayVisitor implements Visitor{

    @Override
    public double visit(Liquor liquor) {
        double priceWithTax = liquor.getPrice() *  0.15 + liquor.getPrice();
        System.out.println("Liquor Item: Price with Tax " + priceWithTax);
        return priceWithTax;
    }

    @Override
    public double visit(Necessity necessity) {
        double priceWithTax = necessity.getPrice() *  0.15 + necessity.getPrice();
        System.out.println("Necessity Item: Price with Tax " + priceWithTax);
        return priceWithTax;
    }
}
