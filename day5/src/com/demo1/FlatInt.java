package com.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatInt 
{

	public static void main(String[] args) 
	{
		List<Integer> a1=Arrays.asList(1,2,3);
		List<Integer> a2=Arrays.asList(4,5,6);
		List<Integer> a3=Arrays.asList(7,8,9);
		
		List<List<Integer>> lst=new ArrayList<List<Integer>>();
	
		lst.add(a1);
		lst.add(a2);
		lst.add(a3);
		
		List<Integer> l=lst.stream().flatMap(f->f.stream()).collect(Collectors.toList());
	
		System.out.println(l);
	
	}

}
