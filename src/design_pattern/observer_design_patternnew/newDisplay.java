package design_pattern.observer_design_patternnew;

public class newDisplay implements Observer,DisplayScreen {
	float temp;
	float humid;
	float pressure;



	@Override
	public void display() {
		float aggregate= temp+humid;
		System.out.println(" newDisplay temp+humid="+aggregate);
	}

	@Override
	public void update(float temp, float humit, float pressure) {
		this.temp=temp;
		this.humid=humit;
		this.pressure=pressure;
		display();
	}

}
