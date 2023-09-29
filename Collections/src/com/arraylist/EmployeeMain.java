package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"Riya","Ludhiana"));
		al.add(new Employee(4,"Aman","Bangalore"));
		al.add(new Employee(3,"Yuvraj","Amritsar"));
		
		al.add(2,new Employee(2,"Itashi","Amritsar"));
		
//		Collections.sort(al,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return o1.getEmpId()-o2.getEmpId();
//			}
//			
//		});
		
		Collections.sort(al,(e1,e2)->{
			return e1.getEmpId()-e2.getEmpId();
		});
		
		
		System.out.println(al);
		
//		Collections.reverse(al);
//		for(Employee e:al)
//		{
//			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpCity());
//		}
	}

}
