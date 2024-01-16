package design_pattern.observer_design_patternnew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherData implements Subject {
	List<Observer>list=new ArrayList<>();
	private float temp;
	private float humid;
	private float pressure;
	
	void setMesureMent(float temp,float humid,float pressure){
		this.temp=temp;
		this.humid=humid;
		this.pressure=pressure;
		notifyObserver();
	}
	
	@Override
	public void registerObserver(Observer o) {
		list.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		list.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(this.temp,this.humid,this.pressure);
		}		
	}

}
