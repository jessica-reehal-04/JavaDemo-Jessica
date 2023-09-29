package com.pack;

public class InnerClass {
	
	private final static int SIZE=15;
	private int [] arr=new int[SIZE];
	
	public InnerClass()
	{
		for(int i=0;i<SIZE;i++)
		{
			arr[i]=i;
		}
	}
	
	public void printEven()
	{
		Inner ic=new Inner();
		
		while(ic.hasNext())
		{
			System.out.println(ic.getNext()+' ');
		}
	}
	
	private class Inner
	{
		private int next=0;
		
		public boolean hasNext()
		{
			return (next<=SIZE-1);
		}
		public int getNext()
		{
			int ret=arr[next];
			next+=2;
			return ret;
		}
	}

	public static void main(String[] args) 
	{
		
		InnerClass i=new InnerClass();
		i.printEven();

	}

}
