package java_8_features.cust_predicate;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static IntPredicate getSquare=x->x%2==0;
	public static IntBinaryOperator ibo =(x,y)->x*y;
	
	public static void main(String[] args) {
		System.out.println("5 is even:"+getSquare.test(5));
		
		System.out.println(ibo.applyAsInt(10, 5));
	}
	
	
}
