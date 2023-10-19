package threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class exMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex=Executors.newFixedThreadPool(5);
		exChild e=new exChild();
		
		ex.execute(e);
		ex.execute(e);
		ex.execute(e);
		ex.execute(e);
		ex.execute(e);
		ex.execute(e);
		ex.execute(e);
		
		ex.shutdown();
	}

}
