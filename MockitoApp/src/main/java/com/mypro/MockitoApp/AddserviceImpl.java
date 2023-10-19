package com.mypro.MockitoApp;

public class AddserviceImpl implements AddService
{

	@Override
	public int add(int num1, int num2) 
	{
		return num1+num2;
	}

	@Override
	public int multiply(int num1, int num2) 
	{
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2)
	{
		return (int) Math.ceil((double)num1/(double)num2);
		
	}

}
