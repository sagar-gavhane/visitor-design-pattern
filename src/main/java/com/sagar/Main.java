package com.sagar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Liquor liquor = new Liquor(120);
        Necessity necessity = new Necessity(65);

        System.out.println("TAX PRICES");
        liquor.accept(taxVisitor);
        necessity.accept(taxVisitor);

        System.out.println("\nTAX HOLIDAY PRICES");
        liquor.accept(taxHolidayVisitor);
        necessity.accept(taxHolidayVisitor);
    }
}