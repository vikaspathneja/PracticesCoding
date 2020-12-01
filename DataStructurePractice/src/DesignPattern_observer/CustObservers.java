package DesignPattern_observer;

public class CustObservers {
	private String nameOfSubscriber;
	private String currentDataofSubscriber;
	
	
public String getNameOfSubscriber() {
		return nameOfSubscriber;
	}

public CustObservers(String name) {
	this.nameOfSubscriber=name;
}

	public void updateData(String data) {
		this.currentDataofSubscriber=data;
	}

	public String getCurrentDataofSubscriber() {
		return currentDataofSubscriber;
	}
	


}
