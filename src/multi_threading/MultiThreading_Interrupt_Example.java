package multi_threading;

public class MultiThreading_Interrupt_Example {
	public static void main(String[] args) throws InterruptedException {
		Runnable r=new custRunnable();
		
		Thread t=new Thread(r);
		t.start();
		System.out.println("main method "+Thread.currentThread().getName());
//		Thread.sleep(2000);
		t.interrupt();
		
		
	}
}
