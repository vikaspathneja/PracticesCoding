package DesignPattern_observer;

public class Main {
	public static void main(String[] args) {
		CustObservable observable=new CustObservable();
		observable.setName("FirstChannel");
		observable.setData("FirstVideo");
	
		CustObservers observor=new CustObservers("vikas");
		System.out.println(observable.subscribe(observor));
		
		CustObservers observor2=new CustObservers("vikas2");
		System.out.println(observable.subscribe(observor2));
		CustObservers observor3=new CustObservers("vikas3");
		System.out.println(observable.subscribe(observor3));
		CustObservers observor4=new CustObservers("vikas4");
		observable.subscribe(observor4);
		CustObservers observor5=new CustObservers("vikas5");
		observable.subscribe(observor5);
		CustObservers observor6=new CustObservers("vikas6");
		observable.subscribe(observor6);
		CustObservers observor7=new CustObservers("vikas7");
		observable.subscribe(observor7);
		
		
		int counter=observable.emit();
		System.out.println("Sent data to total no of users=="+counter);

		System.out.println(observor3.getCurrentDataofSubscriber());
		System.out.println(observor4.getCurrentDataofSubscriber());
		System.out.println(observor5.getCurrentDataofSubscriber());
		System.out.println(observor6.getCurrentDataofSubscriber());

		System.out.println();
		
		observable.setData("FinalVideo");
		int counter2=observable.emit();

		System.out.println(observor3.getCurrentDataofSubscriber());
		System.out.println(observor4.getCurrentDataofSubscriber());
		System.out.println(observor5.getCurrentDataofSubscriber());
		System.out.println(observor6.getCurrentDataofSubscriber());
		
	}
}
