package singletonPackage;

public class SingleTonByEnum {
public static void main(String[] args) {
	SingletonObj singleobj=SingletonObj.INSTANCE;
	singleobj.setValue(10);
	singleobj.setOther("other");
	
	SingletonObj dd=SingletonObj.INSTANCE;
	System.out.println(dd==singleobj);
	
	
}
}
