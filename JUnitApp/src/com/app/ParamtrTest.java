package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParamtrTest {
	
	public int m1;
	public int m2;
	
	static Calculate c;
	
	
	public ParamtrTest(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	
	@Parameters
	public static Collection<Object[]> userData()
	{
		Object[][] data=new Object[][] {{1,2},{3,4},{5,6}};
		return Arrays.asList(data);
	}
	
	@BeforeClass
	public static void callBefore()
	{
		c=new Calculate();
	}

	@Test
	public void testMulti() 
	{
		assertEquals(m1*m2,c.calculateMultiply(m1, m2));
	}
	
	@Test
	public void testAdd()
	{
		assertEquals(m1+m2,c.calculateAdd(m1, m2));
	}

}
