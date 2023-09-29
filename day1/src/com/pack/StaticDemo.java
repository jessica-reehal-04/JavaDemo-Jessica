package com.pack;

public class StaticDemo {
	private static int a=12;
	private static int b;
	static
	{
		System.out.println("Inside static block");
		b=a*12;
	}
	
	static void show()
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		System.out.println("Inside main");
		StaticDemo.show();
	}

}
