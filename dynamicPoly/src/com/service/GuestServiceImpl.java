package com.service;

import com.inter.Restaurant;

public class GuestServiceImpl implements GuestService
{
	private Restaurant restaurant;
	
	
	public GuestServiceImpl(Restaurant r) 
	{
		super();
		this.restaurant=r;
	}


	@Override
	public void inRoomDining(String order) 
	{
		System.out.println(restaurant.prepareDish(order));
	}

}
