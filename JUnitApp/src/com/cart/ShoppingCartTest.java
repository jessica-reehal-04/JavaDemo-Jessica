package com.cart;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingCartTest {
	static Shoppingcart sh;
	
	@Before
	public void callBeforeEach()
	{
		
		ArrayList<Product> al=new ArrayList<>();
		al.add(new Product("Phone",30000));
		al.add(new Product("TV",80900.99));
		sh=new Shoppingcart(al);
		
	}
	
	@Test
	public void addProduct()
	{
		sh.addItem(new Product("Fruits",45));
		int count=sh.getItemCount();
		assertEquals(3,count);
	}

}
