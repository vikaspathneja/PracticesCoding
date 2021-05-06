package JavaConceptExamples;

class MyThread extends Thread{
	@Override
	public void run() {
	for(int i=0; i<20;i++)
		System.out.println(Thread.currentThread().getName());
	}
}


public class MultiThreading {

	public static void main(String[] args) {
		//below is a way to get Thread by extending Thread Class
		Thread t=new MyThread();
		
		t.start();
		for(int i=0; i<20; i++)
			System.out.println(Thread.currentThread().getName());
	}
	
}
