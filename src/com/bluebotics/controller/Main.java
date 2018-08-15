package com.bluebotics.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.bluebotics.model.Calculator;
import com.bluebotics.model.InvalidOperationException;
import com.bluebotics.view.View;

public class Main
{
    public static void main(String...args)
    {
    	View v = new View();
    	Calculator calculator = new Calculator();
    	
    	v.addComputeListener(new ActionListener() {

    		private int convertOperand(String value)
    		{
    			return Integer.parseInt(value);
    		}
    		
			@Override
			public void actionPerformed(ActionEvent e) {
				int firstOperand, secondOperand;
				
				try
				{
					firstOperand = convertOperand(v.getFistOperand());
					secondOperand = convertOperand(v.getSecondOperand());
				}catch(NumberFormatException ex) {
					v.showMessage("invalid operand");
					return;
				}
				
				calculator.setFirstOperand(firstOperand);
				calculator.setSecondOperand(secondOperand);
				
				String message;
				
				try
				{
					message = String.format("Result: %d", calculator.getResult());
				}catch(InvalidOperationException ex) {
					message = "invalid operation";
				}
				v.showMessage(message);
				
			}
		});
    	
		v.setVisible(true);
    }
}
