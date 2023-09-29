import java.lang.*;
import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		try
		{
//			Scanner sc=new Scanner(System.in);
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			
//			int c=a/b;
			
			int c=Integer.parseInt(args[0])/Integer.parseInt(args[1]);

			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Outside");
		
	}

}
