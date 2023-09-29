package com.main;
import com.impl.PrivateSectorBank;
import com.impl.PublicSectorBank;
import com.model.Banking;
import com.template.RBI;

public class BankingMain 
{
	public static void main(String[] args) 
	{
		RBI psb = new PublicSectorBank();
		psb.withDrawService(new Banking(67589,"Salary",80000),2000);
		psb.printBalance();
		
		RBI prsb = new PrivateSectorBank();
		psb.withDrawService(new Banking(45000,"Salary",90000),3000);
		psb.printBalance();
	}

}
