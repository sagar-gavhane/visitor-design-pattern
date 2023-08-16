package com.sagar;

public class Liquor implements Visitable {
    private double price;

    Liquor(double cost) {
        price = cost;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
