package com.mypro.MockitoApp;

public class CalculatorService 
{
	private AddService service;
	
	public CalculatorService(AddService service)
	{
		super();
		this.service=service;
	}
	public int calcAdd(int a,int b)
	{
		return service.add(a, b);
	}
	
	public int calcMultiply(int a,int b)
	{
		return service.multiply(a, b);
	}
	
	public int calDivide(int a,int b)
	{
		return service.divide(a, b);
	}
}
