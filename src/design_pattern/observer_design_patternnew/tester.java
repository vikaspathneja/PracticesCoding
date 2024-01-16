package design_pattern.observer_design_patternnew;

public class tester {
	public static void main(String[] args) {
		WeatherData wd=new WeatherData();
		CurrentConditionDisplay cd=new CurrentConditionDisplay();
		wd.registerObserver(cd);
		wd.setMesureMent(1, 2, 3);
		System.out.println("-----------");
		newDisplay nd=new newDisplay();
		wd.registerObserver(nd);
		System.out.println(wd.list.size());
		wd.setMesureMent(4, 5, 6);
		
	}
}
