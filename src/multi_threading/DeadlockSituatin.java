package multi_threading;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


class intersectionNew {
	private ReentrantLock lock = new ReentrantLock();
	private double mastekPrice;
	


	public ReentrantLock getLock() {
		return lock;
	}

	public double getMastekPrice() {
		return mastekPrice;
	}

	public void setMastekPrice(double mastekPrice) {
		this.mastekPrice = mastekPrice;
	}

	public void setLock(ReentrantLock lock) {
		this.lock = lock;
	}



	
}
class T1 implements Runnable{
	intersectionNew intersect=new intersectionNew();
	
	public T1(intersectionNew i) {
	this.intersect=i;	// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			takeRoad1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void takeRoad1() throws InterruptedException {
//		if(intersect.getLock().tryLock()) {
//			System.out.println("lock taken for road 1---- by thread"+Thread.currentThread().getName());
			 Random randome=new Random();
			 intersect.setMastekPrice(randome.nextInt(2000));
			System.out.println("---Updating Mastek Stock Price-----------"+intersect.getMastekPrice());
			Thread.sleep(20);
//			intersect.getLock().unlock();
//			System.out.println("lock.isLocked()="+lock.isLocked());
			
//		}else {
			System.out.println("---Mastek Stock Price-----------"+intersect.getMastekPrice());
//			System.out.println("dont get lock for road 1--------- by thread "+Thread.currentThread().getName());
//			lock.lockInterruptibly();
//			System.out.println("lock.isLocked()="+lock.isLocked());
//			System.out.println("lock.getHoldCount()="+lock.getHoldCount());
//		}
	}
}

public class DeadlockSituatin {
	
	
	public static void main(String[] args) throws InterruptedException {
		intersectionNew intersect=new intersectionNew();
		
		for(int i=0;i<1000;i++) {
			Thread t=new Thread(new T1(intersect));
			t.start();
		}
	}
}
