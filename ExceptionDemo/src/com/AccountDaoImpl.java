package com;

import exception.AccountNotFoundException;
import exception.AccountTransactionException;
import exception.CustomException;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public class AccountDaoImpl implements AccountDao {

	static float totalAmount[][]=new float[10][10];
	public void deposit(int accNo, float amt) throws CustomException{
		boolean flag=false;
		System.out.println("amount saved for "+accNo);
		
		if(amt <= 0)
			throw new InvalidAmountException("Depositing amount should be greater than Zero");
		for(int i=0; i< totalAmount.length; i++)
		{
			
			
			if(totalAmount[i][0]==accNo)
			{
				        flag=true;
						totalAmount[i][1] +=amt;
						break;
			}
			else if(totalAmount[i][0]==0)
			{
				totalAmount[i][1] =amt;
				totalAmount[i][0] =accNo;
				
				break;
			}
			
			
		}

		if(!flag)
			throw new AccountNotFoundException("Account doesn't exist");
		
		
			
	}

	public float withdraw(int accNo, float amt) throws CustomException{
		boolean flag=false;
		if(amt <=0)
			throw new InvalidAmountException("Withdrawing amount should be greater than Zero");
		
		for(int i=0; i< totalAmount.length; i++)
		{	
			if(totalAmount[i][0]==accNo)
			{
				flag=true;
				if(totalAmount[i][1] <= 0)
					throw new InsufficientBalanceException("Insufficient Balance to Withdraw");
			}
			if(!flag)
				throw new AccountNotFoundException("Account not found.");
			
			if(totalAmount[i][1] <= amt)
				throw new InsufficientBalanceException("Insufficient Balance to Withdraw");
			
			totalAmount[i][1] -=amt;
		}
		
		System.out.println(amt+" amount withdrawn from acount No :"+accNo);
		return amt;
	}

	public float balanceEnquiry(int accNo) throws CustomException{
		float result=0;
		for(int i=0; i< totalAmount.length; i++)
		{	
			
			if(totalAmount[i][0]==accNo)
			{
				result= totalAmount[i][1];
				break;
			}
		}
		return result;
	}

	public void createAccount(int accNo, float amt, String name) {
		for(int i=0; i< totalAmount.length; i++)
		{
			if(totalAmount[i][0]==0)
			{
				totalAmount[i][0]=accNo;
				totalAmount[i][1]=amt;
				break;
			}
			
		}
		
		System.out.println("account created successfully");
		
	}
	
	public void  fundTransfer(int fromAccNo, int toAccNo, float amt) throws AccountTransactionException, AccountNotFoundException
	{
		boolean flag1=false,flag2=false;
		for(int i=0; i< totalAmount.length; i++)
		{
			if(totalAmount[i][0]== fromAccNo)
			{
				flag1=true;
				for(int j=0; j< totalAmount.length; j++)
				{
					if(totalAmount[j][0]== toAccNo)
					{
						flag2=true;
						if(amt <= 0)
							throw new AccountTransactionException("Transfer Amount should be greater than Zero");
							
						if(totalAmount[i][1] <= 0)
							throw new AccountTransactionException("Insufficient Balance to Withdraw from Source Account No.");
						totalAmount[i][1] -=amt;
						totalAmount[j][1] +=amt;
						System.out.println("Successfully transfered");
						break;
					}
				}
				if(!flag2)
					throw new AccountNotFoundException("Account 2 not found");
			}
		}
		if(!flag1)
			throw new AccountNotFoundException("Account 1 not found");
			
		
		
		
	}
	
	
}
