package multi_threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuSample {
	public static void main(String[] args) {
		BlockingQueue<String>bq=new ArrayBlockingQueue<>(10);
		Producer p=new Producer(bq);
		Consumer c=new Consumer(bq);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}



}
