package com.template;

import com.model.Banking;

abstract public class RBI 
{
	abstract public void withDrawService(Banking bank,double amount);
	abstract public void printBalance();
}
