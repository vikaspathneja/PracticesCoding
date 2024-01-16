package multi_threading;


public class OddEveninTwoThreads {
	static Object myobj = new Object();
	static int counter = 1;
	static int max = 100;
	static int even=0;
	public static void main(String[] args) throws InterruptedException {
		Runnable odd = () -> {
			while (counter <= max) {
				synchronized (myobj) {
					if(counter%2!=even) {
						System.out.println(Thread.currentThread().getName()+" "+counter);
						counter++;
						myobj.notify();
						try {
							myobj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else{
						System.out.println(Thread.currentThread().getName()+" "+counter);
						counter++;
						myobj.notify();
						try {
							myobj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}

			}
			System.out.println("after while loop");
			
		};
		
		Thread t1=new Thread(odd);
		Thread t2=new Thread(odd);
		t2.start();
		t1.start();
		
	}
}
