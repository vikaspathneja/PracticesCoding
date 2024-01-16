package multi_threading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue bq;
	public Producer(BlockingQueue bq) {
		super();
		this.bq=bq;
	}
	@Override
	public void run() {
		try {
			System.out.println("producing element 1");
			this.bq.put("producing element 1");
			Thread.sleep(1000);
			System.out.println("producing element 2");
			this.bq.put("producing element 2");
			Thread.sleep(1000);
			System.out.println("producing element 3");
			this.bq.put("producing element 3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}