package design_pattern.observer_design_patternnew;

public class CurrentConditionDisplay implements DisplayScreen, Observer {
	float temp;
	float humid;
	float pressure;

	
	@Override
	public void display() {
		String s="CurrentConditionDisplay [temp=" + temp + ", humid=" + humid + ", pressure=" + pressure + "]";
		System.out.println(s);
	}



	@Override
	public void update(float temp, float humid, float pressure) {
		this.temp=temp;
		this.humid=humid;
		this.pressure=pressure;
		display();
	}

}
