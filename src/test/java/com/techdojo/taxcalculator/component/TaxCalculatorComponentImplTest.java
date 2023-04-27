package com.techdojo.taxcalculator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaxCalculatorComponentImplTest {
    @Autowired
    TaxCalculatorComponent taxCalculatorComponent;
    /*
    *  Tax brackets
    * Tax bracket A(0 to 14k) = 10.5%
    * Tax bracket B($14,001 to $48,000) = 17.50%
    * Tax bracket C($48,001 to $70,000) = 30.00%
    * Tax bracket D($70,001 to $180,000) = 33.00%
    * Tax bracket E($180,000+) = 39.00%
     * */

    @Test
    void taxBracketAisAppliedWhenIncomeIsBellow14k() {
        double income = 14000.00;
        double actualTaxToPay =  taxCalculatorComponent.calculateTax(120.00);
        double expectedTaxToPay = income * (10.5 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
}