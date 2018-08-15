package com.bluebotics.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {

	private JTextField firstOperand, secondOperand;
	private JButton compute;

	public View()
	{
		this.setSize(800, 200);
		this.setTitle("My calculator");

		JPanel newPanel = new JPanel();
		newPanel.setBackground(Color.BLUE);
		newPanel.setLayout(null);
		
		Font fontFirstOperand = new Font("SansSerif", Font.BOLD, 20);
		firstOperand = new JTextField(10);
		firstOperand.setFont(fontFirstOperand);
		firstOperand.setBounds(10, 15, 50, 90);
		newPanel.add(firstOperand);

		Font fontSecondOperand = new Font("SansSerif", Font.BOLD, 28);
		secondOperand = new JTextField(10);
		secondOperand.setFont(fontSecondOperand);
		secondOperand.setBounds(100, 10, 50, 80);
		newPanel.add(secondOperand);

		compute = new JButton("Compute");
		compute.setBounds(300, 30, 100, 50);
		newPanel.add(compute);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(newPanel);
	}

	public void addComputeListener(ActionListener listener)
	{
		compute.addActionListener(listener);
	}

	public String getFistOperand()
	{
		return firstOperand.getText();
	}

	public String getSecondOperand()
	{
		return secondOperand.getText();
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
