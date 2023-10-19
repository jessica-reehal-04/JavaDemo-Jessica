package com.model;

public class MainApp {

	public static void main(String[] args) throws EmptyException 
	{
		SongsApp app=new SongsApp();
		
		try
		{
			app.show();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			app.displayRecords();
		  
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
		    app.sortRecords();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			app.filterRecords();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	

	}

}
