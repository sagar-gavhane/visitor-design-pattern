package com.sagar;

public interface Visitor {
    public double visit(Liquor liquor);
    public double visit(Necessity necessity);
}
