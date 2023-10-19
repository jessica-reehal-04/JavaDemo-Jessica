package threaddemo;

public class threadchild implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>=0;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}

}
