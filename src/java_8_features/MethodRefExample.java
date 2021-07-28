package java_8_features;

@FunctionalInterface
interface funInterface{
	
	abstract void fun();
	public static int say() {
		System.out.println("static method called");
		return 1;
	}
}
public class MethodRefExample {
	public static void myFunction() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
//		funInterface inter2=()->{System.out.println("hello fun");};
		funInterface imp=funInterface::say;
//		int hh=imp.fun();
		
	}

}
