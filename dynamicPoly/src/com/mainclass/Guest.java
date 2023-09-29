package com.mainclass;

import com.inter.American;
import com.inter.Indian;
import com.service.GuestService;
import com.service.GuestServiceImpl;
import com.service.LaundryService;
import com.service.LaundryServiceImpl;

public class Guest 
{
	public static void main(String[] args)
	{
		GuestService guest=new GuestServiceImpl(new American());
		
		guest.inRoomDining("Fries");
		
		LaundryService laundry=new LaundryServiceImpl();
		if(laundry.isLaundry())
		{
			System.out.println("Laundry service available");
		}
		else
		{
			System.out.println("Laundry service unavailable");
		}
	}

}
