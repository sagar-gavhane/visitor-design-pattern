package com.example;

public class Necessity implements Visitable {
    private double price;

    Necessity(double cost) {
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
