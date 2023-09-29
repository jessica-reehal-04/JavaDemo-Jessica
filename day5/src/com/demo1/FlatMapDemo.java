package com.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo 
{
	public static void main(String[] args)
	{
		List<String> p1=Arrays.asList("p1","p2","p3");
		List<String> p2=Arrays.asList("p4","p5","p6");
		List<String> p3=Arrays.asList("p7","p8","p9");
		
		List<List<String>> ap=new ArrayList<List<String>>();
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
		
		//without flat map
//		for(List<String> pro:ap)
//		{
//			for(String s:pro)
//			{
//				System.out.print(s+" ");
//			}
//		}
		
		//with flat map
		List<String> fltmap=ap.stream().flatMap(f->f.stream()).collect(Collectors.toList());
		System.out.println(fltmap);
		
	}
}
