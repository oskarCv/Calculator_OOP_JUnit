package com.hcl.javaSeBasic.training.operations;

public class Addition extends Operation {
	@Override
	public double performOperation(double num1, double num2) {
		
		System.out.println("The resoult by adding "+num1 +" + "+ num2 + " = "+ addition(num1,num2));
		return addition(num1,num2);
	}
	private double addition(double num1, double num2){
		double result = num1 + num2;
		return result;
	}
}
