package threaddemo;

public class PrintSyn implements Runnable
{
	Thread thread;
	
	String s1,s2;
	
	public PrintSyn(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
		
		thread=new Thread(this);
		thread.start();
	}


	@Override
	public void run() {
		SynDemo.print(s1,s2);
		
	}
	

}
