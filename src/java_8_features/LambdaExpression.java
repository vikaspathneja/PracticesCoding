package java_8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface inter {
	int square(int no);

	static void say() {
		System.out.println("static method called");
	}
}




public class LambdaExpression {
	public static void main(String[] args) {
		inter ref=x->{ 
			int value=x*x;
			return value;
		};
		
		
;
		

		
//		System.out.println("hashcode==="+ref.hashCode()+" "+ref.square(10));

	
		Comparator<Integer> c=(i1,i2)->i1>i2?1:i1<i2?-1:0;
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.sort(c);
		System.out.println(list);
	}
	
	
}
