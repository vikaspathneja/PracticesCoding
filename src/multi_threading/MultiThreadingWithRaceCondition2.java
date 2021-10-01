package multi_threading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadingWithRaceCondition2 {
	Lock mlock=new ReentrantLock();
	
	public static void main(String[] args) throws InterruptedException {
		
		new MultiThreadingWithRaceCondition2().myfun();
	}


	void myfun() throws InterruptedException {

		SharedListResource resource = new SharedListResource();
		Random r=new Random();
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
//				mlock.lock();
				resource.addItem(r.nextInt(10));
//				mlock.unlock();
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 10; i++) {
				try {
					mlock.lock();
					resource.remove();
					mlock.unlock();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
//		t1.join();
		Thread t2 = new Thread(r2);
		t2.start();
//		t2.join();
		
		
		
		t1.join();
		t2.join();
		resource.printList();
	}
}
