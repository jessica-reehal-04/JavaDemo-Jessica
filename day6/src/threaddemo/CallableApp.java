package threaddemo;

import java.util.concurrent.Callable;

public class CallableApp implements Callable<String>
{

	@Override
	public String call(){
		System.out.println("Before sleep");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("After sleep");
		
		return "Finished";
	}
	
}
