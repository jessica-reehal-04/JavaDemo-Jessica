package threaddemo;


class Multi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			
		}
}
	
public static void main(String args[])
{
	Multi t1=new Multi();
	Multi t2=new Multi();
	Multi t3=new Multi();
	
	Thread th1=new Thread(t1);
	Thread th2=new Thread(t2);
	Thread th3=new Thread(t3);
	
	th1.start();
	
	try 
	{
	    th1.join(1500);
	} 
	
	catch (InterruptedException e) {
	
	e.printStackTrace();
	
	}
	
	
	th2.start();
	
	try
	{
	    th2.join();
	}
	
	catch(InterruptedException e)
	{

	}
	
	th3.start();
	
}
}
