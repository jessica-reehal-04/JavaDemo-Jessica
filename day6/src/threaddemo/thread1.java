package threaddemo;

public class thread1 {

	public static void main(String[] args) 
	{
		
		try 
		{
			System.out.println("Welcome");
			Thread.sleep(1000);
			System.out.println("to");
			Thread.sleep(1000);
			System.out.println("Java");
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
