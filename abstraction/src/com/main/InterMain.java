package com.main;

import com.impl.Agent1;
import com.inter.IRDA;
import com.models.Insurance;

public class InterMain 
{
	public static void main(String[] args) 
	{
		IRDA in=new Agent1();
		in.buyPolicy(new Insurance("Life",4500));
		in.claimPolicy("Life");
	}
}
