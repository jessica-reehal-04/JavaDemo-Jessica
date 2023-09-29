package com.inter;

import com.models.Banking;

public interface RBI 
{
	void withDrawService(Banking bank,double amount);
	void printBalance();
}
