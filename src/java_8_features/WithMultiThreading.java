package java_8_features;

import java.util.ArrayList;
import java.util.List;

public class WithMultiThreading {

public static void main(String[] args) throws InterruptedException {
	List<String>list=new ArrayList<>();
	CustProducer p=new CustProducer(list);
	CustConsumer c=new CustConsumer(list);
	Thread t1=new Thread(p);
	Thread t2=new Thread(c);
	
	
	t1.start();
	Thread.sleep(1000);
	t2.start();
	
}


}
