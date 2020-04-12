package com.fabrizio;

public class TaxCalculator2018 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
     @Override
    public double calculateTax(){
        getTaxableIncome()
        return taxableIncome * 0.3;
    }
}
