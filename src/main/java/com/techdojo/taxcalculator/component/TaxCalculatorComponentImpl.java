package com.techdojo.taxcalculator.component;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorComponentImpl implements TaxCalculatorComponent{
    @Override
    public double calculateTax(double annualIncome) {
        if(annualIncome < 1000){
            return 0;
        }
        return annualIncome * (10.5 / 100);
    }
}
