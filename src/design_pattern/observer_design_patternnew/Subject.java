package design_pattern.observer_design_patternnew;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
