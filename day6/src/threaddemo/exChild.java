package threaddemo;

public class exChild implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
