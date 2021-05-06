package singletonPackage;
public enum SingletonObj{
	INSTANCE;
	private int value;
	private String other;

	int getValue(){
		return value;
	}
	String getother(){
		return other;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setOther(String other) {
		this.other = other;
	}
}