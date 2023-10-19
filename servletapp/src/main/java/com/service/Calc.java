package com.service;

import javax.servlet.annotation.WebServlet;

@WebServlet
public class Calc 
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
