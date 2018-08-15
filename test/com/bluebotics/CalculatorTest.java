package com.bluebotics;

import com.bluebotics.model.Calculator;
import com.bluebotics.model.InvalidOperationException;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public void testAdd() throws InvalidOperationException {

		Calculator calculator = new Calculator();
		
		calculator.setFirstOperand(20);
		calculator.setSecondOperand(4);
		
		assertEquals(24, calculator.getResult());
	}
}
