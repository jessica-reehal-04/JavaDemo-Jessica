package com.mypro.MockitoApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalcTest 
{
	@Test
	void testCalc()
	{
		AddService addService;
		CalculatorService calculatorService;
		
		addService= Mockito.mock(AddService.class);
		
		calculatorService=new CalculatorService(addService);
		int data1=11;
		int data2=12;
		int expected1=23;
		int expected2=132;
		int expected3=1;
		
		Mockito.when(addService.add(data1, data2)).thenReturn(expected1);
	
		Mockito.when(addService.multiply(data1, data2)).thenReturn(expected2);
		
		Mockito.when(addService.divide(data1, data2)).thenReturn(expected3);
	    int actual=calculatorService.calcAdd(data1, data2);
	    int actual1=calculatorService.calcMultiply(data1, data2);
	    int actual2=calculatorService.calDivide(data1, data2);
	    assertEquals(expected1,actual);
	    assertEquals(expected2,actual1);
	    assertEquals(expected3,actual2);
	}
}
