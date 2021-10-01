package multi_threading;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResourceWithAtomicInteger {
	private AtomicInteger counter=new AtomicInteger();
	
	public void increment() {
		this.counter.incrementAndGet();
	}
	
	public void decrement() {
		this.counter.decrementAndGet();
	}
	
	public int getCounter() {
		return counter.get();
	}
	

}
