package com.cart;

import java.util.ArrayList;


import org.junit.Test;

import com.exception.TitleNotFoundException;

public class Shoppingcart {
	private ArrayList<Product> al;
	

	public Shoppingcart() {
		this.al=new ArrayList<>();
	}



	public Shoppingcart(ArrayList<Product> al)
	{
		super();
		this.al=al;
	}
	
	
	
	public int getItemCount()
	{
		return al.size();
	}
	
	public void addItem(Product product)
	{
		this.al.add(product);
	}
	
	public void removeItem(String title) throws TitleNotFoundException
	{
		int index=-1;
		for(Product p:al)
		{
			if(p.getTitle().equalsIgnoreCase(title))
			{
				index=al.indexOf(p);
			}
		}
//		for(Product pp:al)
//		{
//			if(p.getTitle().equalsIgnoreCase(pp.getTitle()))
//			{
//				index=al.indexOf(pp);
//			}
//		}
		if(index==-1)
			throw new TitleNotFoundException("The given product doesn't exists");
		al.remove(index);
	}
	
	public ArrayList<Product> getList()
	{
		return this.al;
	}
	
	public double getTotalPrice()
	{
		double add=al.stream().mapToDouble(m->m.getPrice()).sum();
		return add;
	}

}
