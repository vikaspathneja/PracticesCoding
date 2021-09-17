package java_8_features;

import java.util.ArrayList;
import java.util.List;

interface Interf{
	public void m1();
}

public class CustomLambdaExample {
	int x=100;
	static List<Integer> l=new ArrayList<>();
	
	public static void main(String[] args) {
		l.add(1);
		l.add(2);
		CustomLambdaExample clx= new CustomLambdaExample();	
		clx.m2();
		System.out.println(clx.x);
		System.out.println(clx.l);
	}
	
	private void m2() {
		int y=200;
		
		Interf i=()->{
			x=500;
			l.add(3);
			l.add(4);
		};
		i.m1();
	}
	
	

}
