package multi_threading;

import java.util.Random;

import pojos.Employee;

public class ThreadLocalExample {
	public static void main(String[] args) throws InterruptedException {
//	normalmultiThreading();
	normalmultiThreadingWithThreadLocalVariable();
	}

	private static void normalmultiThreading() throws InterruptedException {
		Employee emp=new Employee();
		Runnable r=()->{
			try {
				System.out.println("Before modify :"+Thread.currentThread().getName()+"emp:"+emp);
				emp.setName("vikas"+new Random().nextInt());
				System.out.println("after modify  :"+Thread.currentThread().getName()+"emp:"+emp);
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("after sleep :"+Thread.currentThread().getName()+"emp:"+emp);
		};
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		Thread.sleep(4000);
		System.out.println("final emp:"+emp);
	}
	
	private static void normalmultiThreadingWithThreadLocalVariable() throws InterruptedException {
		ThreadLocal<Employee> emp=new ThreadLocal<>();
		Runnable r=()->{
			try {
				System.out.println("Before modify :"+Thread.currentThread().getName()+"emp:"+emp.get());
				if(emp.get()==null) {
					Employee empl=new Employee();
					empl.setName("vikas"+new Random().nextInt());
					emp.set(empl);
				}
				System.out.println("After modify:"+Thread.currentThread().getName()+"emp:"+emp.get());
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("After sleep"+Thread.currentThread().getName()+"emp:"+emp.get());
		};
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		Thread.sleep(4000);
		System.out.println("final employee:"+emp.get());
	}

}
