package day4;

public class CalculatorImpl {
	
	
	
	public static void main(String[] args) 
	{
//		Calculator add=(int a,int b)->a+b;
//		Calculator sub=(int a,int b)->a-b;
//		
//		System.out.println(add.operation(2, 3));
//		
//		System.out.println(sub.operation(7, 3));
//		
		Calculator ad=(int a,int b)->{
			System.out.println(a+b);
		};
		
		ad.add(4, 5);
		
	
	
	}

}
