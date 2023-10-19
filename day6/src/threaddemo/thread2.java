package threaddemo;

public class thread2 {

	public static void main(String[] args)
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("New Main");
		System.out.println(thread);
		
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread);
	}

}
