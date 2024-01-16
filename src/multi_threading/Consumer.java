package multi_threading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue bq;
	public Consumer(BlockingQueue bq) {
		super();
		this.bq=bq;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("consuming:"+this.bq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}