package com.impl;

import com.inter.IRDA;
import com.inter.SEBI;
import com.models.Insurance;
import com.models.Stocks;

public class Agent2 implements SEBI,IRDA
{
	Stocks st=new Stocks();
	@Override
	public void buyPolicy(Insurance in) 
	{
		
	}

	@Override
	public void claimPolicy(String insuranceType) 
	{
		
	}

	@Override
	public void addStocks(Stocks s) 
	{
		st.setStockId(s.getStockId());
		st.setStockName(s.getStockName());
		st.setQty(s.getQty());
		st.setPrice(s.getPrice());
		
		System.out.println(st);
	}

	@Override
	public void sellStocks(int stockId) 
	{
		if(st.getStockId()==stockId)
		{
			st=null;
		}
		System.out.println("Stock "+stockId+" sold!!");
	}

	
	
}
