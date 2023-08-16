package com.example;

public class TaxVisitor implements Visitor {
    public TaxVisitor() {
        //
    }

    @Override
    public double visit(Liquor liquor) {
        double priceWithTax = liquor.getPrice() * 0.18 + liquor.getPrice();
        System.out.println("Liquor Item: Price with Tax " + priceWithTax);
        return priceWithTax;
    }

    @Override
    public double visit(Necessity necessity) {
        double priceWithTax = necessity.getPrice() * 0 + necessity.getPrice();
        System.out.println("Necessity Item: Price with Tax " + priceWithTax);
        return priceWithTax;
    }
}
