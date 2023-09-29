package com.impl;

import com.inter.IRDA;
import com.inter.RBI;
import com.models.Banking;
import com.models.Insurance;

public class Agent1 implements IRDA,RBI
{
	Insurance insurance=new Insurance();
	Banking b=new Banking();

	@Override
	public void buyPolicy(Insurance in) 
	{
		insurance.setInsuranceType(in.getInsuranceType());
		insurance.setPremium(in.getPremium());
		System.out.println(insurance);
	}

	@Override
	public void claimPolicy(String insuranceType) 
	{
		System.out.println(insuranceType+" has bee claimed!!");
	}

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
