package singletonPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class tester {
	public static void main(String[] args) throws InterruptedException {
		Random rand=new Random();
		List<singletonOldMethod>list=new ArrayList<>();
		List<SingletonObj>list2=new ArrayList<>();
		Runnable r=()->{
			long start=System.currentTimeMillis();
		singletonOldMethod s=singletonOldMethod.getInstance();
//			SingletonObj s=SingletonObj.INSTANCE;
			s.setObjintvalue(rand.nextInt(1000));		
//		System.out.println(Thread.currentThread().getName()+" value "+s.getObjintvalue());
		list.add(s);
//		list2.add(s);
		long end=System.currentTimeMillis();
		long lll=end-start;
		System.out.println("end-start in run="+lll);	
		};
		
		Consumer<List<singletonOldMethod>>consumer=(x)->x.forEach(y->System.out.println(y.getObjintvalue()));
		List<Thread>threads=new ArrayList<Thread>();
		long start=System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			Thread t=new Thread(r);
			threads.add(t);
			t.start();
		}
		
		for (Thread thread : threads) {
			thread.join();
		}
		long end=System.currentTimeMillis();
		
//		Thread.sleep(2000);
//		consumer.accept(list);
		long lll=end-start;
		System.out.println("end-start="+lll);	
//		System.out.println(s.getObjintvalue());
	}
}
