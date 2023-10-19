package threaddemo;

public class ChildThreadDemo implements Runnable
{
	Thread thread;
	
	public ChildThreadDemo()
	{
		thread=new Thread(this,"Child Thread");
		System.out.println("Child Thread is ready");
		thread.start();
	}
	public void run()
	{
		System.out.println("Child Thread"+thread.getName());
	}
}
