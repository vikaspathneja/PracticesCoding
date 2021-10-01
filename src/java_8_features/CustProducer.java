package java_8_features;

import java.util.List;

public class CustProducer implements Runnable{
	List<String>list;
	final int limit=5;
	public CustProducer(List<String>list) {
		this.list=list;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			synchronized (list) {
			while(list.size()==limit) {
					System.out.println("List full waiting for getting consumed");
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}

			synchronized (list) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				System.out.println("Item Producted: "+i);
				list.add("Item-"+i);
				list.notify();
			}
		}
	}

}
