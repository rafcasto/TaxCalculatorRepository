package com.techdojo.taxcalculator.component;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorComponentImpl implements TaxCalculatorComponent{
    @Override
    public double calculateTax(double annualIncome) {
        return 0;
    }
}
