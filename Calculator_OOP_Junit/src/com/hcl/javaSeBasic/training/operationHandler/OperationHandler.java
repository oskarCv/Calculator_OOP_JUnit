package com.hcl.javaSeBasic.training.operationHandler;

import java.util.ArrayList;
import java.util.List;

import com.hcl.javaSeBasic.training.operations.Addition;
import com.hcl.javaSeBasic.training.operations.Divition;
import com.hcl.javaSeBasic.training.operations.Multiplication;
import com.hcl.javaSeBasic.training.operations.Operation;
import com.hcl.javaSeBasic.training.operations.RecursiveFactorial;
import com.hcl.javaSeBasic.training.operations.ReverseInteger;
import com.hcl.javaSeBasic.training.operations.Substraction;

public class OperationHandler implements ReverseInteger{
	private String expression = "";
	private RecursiveFactorial factorial = null;
	private double num1 = 0;
	private double num2 = 0;
	private char operator = '0';

	// Empty constructor definition
	public OperationHandler() {	}

	// Constructor with one parameter definition
	public OperationHandler(String expression) {
		this.expression = expression;
	}
 
	public double operation() {
		splitExpression();
		return performOperation();
	}

	
	private void splitExpression() {
		for (byte i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '/'
					|| expression.charAt(i) == '*') {
				operator = expression.charAt(i);
			}
		}
		num1 = Double.parseDouble(expression.substring(0, expression.indexOf(operator)));
		num2 = Double.parseDouble(expression.substring(expression.indexOf(operator) + 1));
	}

	private double performOperation() {
		double result = -1000;
		Operation op;
		switch (operator) {
		case '+':
			
			op = new Addition();
			try {
				result = op.performOperation(num1, num2);

			} catch (Exception e1) {
				e1.printStackTrace();
			}
			break;
		case '-':
			op = new Substraction();
			try {
				result = op.performOperation(num1, num2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case '*':
			op = new Multiplication();
			try {
				result = op.performOperation(num1, num2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case '/':
			op = new Divition();
			try {
				result = op.performOperation(num1, num2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		return result;
	}

	@Override
	public void reversedInteger(int num) {
		System.out.println("Entered number: "+ num+"\nInverted Number: "+ reversingInteger(num));
	}
	private List<Integer> reversingInteger(int num){
		List<Integer> invertedNum = new ArrayList<>();
		while(num > 0){
			invertedNum.add(num%10);
			num/=10;
		}
		return invertedNum;
	}
	public void getFactorial(int num){
		factorial = new RecursiveFactorial(num);
		factorial.getFactorial();
	}
}