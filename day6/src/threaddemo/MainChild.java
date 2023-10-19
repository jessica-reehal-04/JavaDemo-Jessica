
package threaddemo;

public class MainChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadchild t=new threadchild();
		Thread thread=new Thread(t,"My thread");
		
		thread.start();
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
