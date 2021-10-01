package multi_threading;

import java.util.List;

public class SharedResourceCust {
	private int counter;

	public void increment() {
		this.counter++;
	}
	
	public void decrement() {
		this.counter--;
	}
	
	public int getCounter() {
		return counter;
	}
}
