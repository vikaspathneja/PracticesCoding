package multi_threading;

import java.util.Random;

public class AtomicIntegerExample {
	
	public static void main(String[] args) throws InterruptedException {
		new AtomicIntegerExample().myfun();
	}


	void myfun() throws InterruptedException {

		SharedResourceWithAtomicInteger resource = new SharedResourceWithAtomicInteger();
		Runnable r1=()->{
			for (int i = 0; i < 1000; i++) {
				resource.increment();
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 1000; i++) {
				resource.decrement();
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
		System.out.println("final counter="+resource.getCounter());
	}
}
