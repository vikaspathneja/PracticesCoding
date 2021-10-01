package multi_threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharedListResource {
	private List<Integer>list=new ArrayList<Integer>();

	
	public void addItem(int no) {
		this.list.add(no);
		System.out.println(no+" item added "+Thread.currentThread().getName());
//		this.notifyAll();
	}
	
	public void remove() throws InterruptedException {
		if(list.size()>0) {
		System.out.println((list.size()-1)+"item to be removed "+Thread.currentThread().getName());
		this.list.remove(list.size()-1);
		}
		else {
		System.out.println("no item found for remove "+Thread.currentThread().getName());
//		this.wait();
		}
	}
	
	public void printList() {
	System.out.println(Arrays.toString(list.toArray()));
	}
}
