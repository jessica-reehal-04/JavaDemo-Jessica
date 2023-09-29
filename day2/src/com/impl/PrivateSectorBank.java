package com.impl;

import com.model.Banking;
import com.template.RBI;

public class PrivateSectorBank extends RBI
{
	Banking b=new Banking();
	@Override
	public void withDrawService(Banking bank, double amount) 
	{
		b.setAccNo(bank.getAccNo());
		b.setAccType(bank.getAccType());
		b.setBalance(bank.getBalance());
		
		double a=b.getBalance();
		b.setBalance(a-amount);
		
		
	}

	@Override
	public void printBalance() 
	{
		System.out.println(b.getBalance());
	}

}
