package com.bluebotics.model;

public class Calculator {

	private int firstOperand;
	private int secondOperand;

	public Calculator() {
		this.firstOperand = 0;
		this.secondOperand = 0;
	}

	public void setFirstOperand(int firstOperand) {
		this.firstOperand = firstOperand;
	}

	public void setSecondOperand(int secondOperand) {
		this.secondOperand = secondOperand;
	}

	public int getFirstOperand()
	{
		return firstOperand;
	}
	
	public int getSecondOperand()
	{
		return secondOperand;
	}
	
	public int getResult() throws InvalidOperationException {
		return firstOperand + secondOperand;
	}
}
