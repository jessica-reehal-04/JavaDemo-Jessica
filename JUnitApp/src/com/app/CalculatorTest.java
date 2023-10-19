package com.app;


import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import org.junit.Rule;

import org.junit.rules.Timeout;
import org.junit.jupiter.api.*;


class CalculatorTest 
{
	
	static Calculate c;
	
	
	CountDownLatch gt=new CountDownLatch(1);
	
	@Rule
	public Timeout tout=Timeout.seconds(20);
	
	public static String Log;
	
	@Test
//	@Timeout(unit=TimeUnit.MILLISECONDS,value=1000)
	public void testOne() throws InterruptedException
	{
		Log+="r-1";
		TimeUnit.SECONDS.sleep(10);
		
	}
	@BeforeAll
	public static void callBeforeClass()
	{
		System.out.println("Before all");
		c=new Calculate();
	}
	
	@BeforeEach
	void callBefore()
	{
		System.out.println("Called before");
	}

	
	@AfterEach
	void callAfter()
	{
		System.out.println("Called After");
	}
	

	@Test
//	@Timeout(unit=TimeUnit.MILLISECONDS,value=1000)
	void testCalculateAdd()
	{
//		try
//		{
//			Thread.sleep(2000);
//		}
//		catch(Exception e) {}
		assertEquals(7,c.calculateAdd(3, 4));
		
	}
	
	@Test
	void testCalculateSubtract()
	{
		assertEquals(-1,c.calculateSubtract(3, 4));
	}
	
	@Test
	void testCalculateMultiply()
	{
		assertEquals(12,c.calculateMultiply(3, 4));
	}
	
	@Test
	void testCalculateDivide()
	{
		assertEquals(1,c.calculateDivide(4,3));
	}
	
	
	
	
	

}
