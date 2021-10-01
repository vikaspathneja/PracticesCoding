package java_8_features;

import java.util.List;

public class CustConsumer implements Runnable{
	List<String>list;
	final int limit=0;
	public CustConsumer(List<String>list) {
		this.list=list;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			synchronized (list) {
				while(list.size()==limit) {
					System.out.println("List empty waiting for getting produced");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
			synchronized (list) {
				System.out.println("Item Consumed by "+Thread.currentThread().getName()+" item "+list.remove(0));
			list.notify();;
			}
		}
	}

}
