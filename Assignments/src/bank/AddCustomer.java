package bank;

import java.util.*;

public class AddCustomer 
{
	public void printCustomers(List<String> arrayList)
	{
 
		System.out.println("Customers are : "); 
		
//		Iterator<String> iterator=arrayList.iterator();
		
//		while(iterator.hasNext())
//		{
//		    System.out.println(iterator.next());
//		}
		
		for(String c:arrayList)
		{
			System.out.println(c);
		}
		
	}
	

	
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ajay"); 
		list.add("Riya"); 
		list.add("Mohit");
		
		
		AddCustomer addCustomer = new AddCustomer();
		addCustomer.printCustomers(list);
		
	}
}
