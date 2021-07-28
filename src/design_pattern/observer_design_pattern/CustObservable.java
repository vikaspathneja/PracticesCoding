package design_pattern.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CustObservable {
	private String name;
	private String data;
	private List<CustObservers>list=new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int emit(){
		int counter=0;
		for(CustObservers obs:list) {
			counter++;
			obs.updateData("Hi " +obs.getNameOfSubscriber()+" here is updated data "+this.data);
		}
		return counter;
	}
	public String subscribe(CustObservers observer){
		this.list.add(observer);
		return observer.getNameOfSubscriber()+" have subscribe to "+this.name;
	}
	@Override
	public String toString() {
		return "CustObservable [name=" + name + ", data=" + data + ", list=" + list + "]";
	}
	
	
}