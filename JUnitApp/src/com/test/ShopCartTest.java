package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cart.Product;
import com.cart.Shoppingcart;
import com.exception.TitleNotFoundException;

public class ShopCartTest 
{
	private Shoppingcart cart;
	private Product p1;
	private Product p2;
	private Product p3;
	@Before
	public void init()
	{
		cart=new Shoppingcart();
		p1=new Product("JAVA Book",230.00);
		p2=new Product("C# Book",130.00);
		p3=new Product("C Book",100.00);
		cart.addItem(p1);
		cart.addItem(p2);
		cart.addItem(p3);
	}
	
//	@Test
	public void testAddCart()
	{
		Product p3=new Product("JAVA Book",230.0);
		cart.addItem(p3);
		assertEquals(3,cart.getItemCount());
	}
	
	@Test
	public void testRemoveCart() throws TitleNotFoundException
	{
		
		cart.removeItem("JAVA Book");
		
		assertEquals(2,cart.getItemCount());
	}
	
//	@Test
	public void testTotalPrice()
	{
		int p1=(int)460.00;
		int p2=(int)cart.getTotalPrice();
		assertEquals(p1,p2);
		
	}

}
