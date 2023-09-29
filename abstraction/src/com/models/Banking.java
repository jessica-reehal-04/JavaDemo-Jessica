package com.models;

public class Banking 
{
	private int accNo;
	private String accType;
	private double balance;
	
	
	public Banking() 
	{
		super();
	}
	


	public Banking(int accNo, double balance) 
	{
		super();
		this.accNo = accNo;
		this.balance = balance;
	}




	public Banking(int accNo, String accType, double balance) 
	{
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}


	public int getAccNo() 
	{
		return accNo;
	}


	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}


	public String getAccType() 
	{
		return accType;
	}


	public void setAccType(String accType)
	{
		this.accType = accType;
	}


	public double getBalance()
	{
		return balance;
	}


	public void setBalance(double balance) 
	{
		this.balance = balance;
	}



	@Override
	public String toString() 
	{
		return "Banking [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}
	
	
	
	

}
