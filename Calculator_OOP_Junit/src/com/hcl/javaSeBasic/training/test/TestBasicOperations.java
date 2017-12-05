package com.hcl.javaSeBasic.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hcl.javaSeBasic.training.operationHandler.OperationHandler;

public class TestBasicOperations {
	OperationHandler operationHandler; 
	@Test
	public void testAddition() {
		operationHandler = new OperationHandler("2+3");
		assertEquals(5,(int)operationHandler.operation());
	}
	@Test
	public void testSubstraction(){
		operationHandler = new OperationHandler("2-3");
		assertEquals(-1,(int)operationHandler.operation());
	}
	@Test
	public void testMultiplication(){
		operationHandler = new OperationHandler("3*5");
		assertEquals(multiply(3,5),(int)operationHandler.operation());
	}
	public int multiply(int operA, int operB){
		return operA*operB;
	}
	
	@Test
	public void testDivition(){
		int numA = 4;
		int numB = 5;
		operationHandler = new OperationHandler(""+multiply(numA,numB)+"/"+numA);
		assertEquals(5,(int)operationHandler.operation());
	}
}
