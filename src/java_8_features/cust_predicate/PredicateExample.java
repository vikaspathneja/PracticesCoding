package java_8_features.cust_predicate;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> p_greaterThan10 = (x) -> x > 10;
		Predicate<Integer> p_isEven = (x) -> x % 2 == 0;
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		
		Predicate<String> p_startWithK = x -> x.startsWith("k");
		Predicate<String> p_notEmpty = x -> x!=null && x.length()>0;
		
		String[] str = { "vikas","sim","kiaan","mohit","vaibhav","asha","gulshan","kkkaaa","aajhhh","bbb","",null,"",null,"","kia"};
		

		for(String s:str) {
			if(p_notEmpty.and(p_startWithK).test(s))
				System.out.println(s);
		}
		
		
		for (int x : integers) {

			/**
			 * Predicate Joining Example 1
			 */
			if (p_greaterThan10.and(p_isEven).test(x)) {
				System.out.println(" no is greater than 10 and is even:="+x);
			}
			
			/**
			 * Predicate Joining Example 2
			 */
			else if (p_greaterThan10.and(p_isEven.negate()).test(x)) {
				System.out.println(" no is greater than 10 and is not even:="+x);
			}
			
			//Normal Predicate
			else if (p_greaterThan10.test(x)) {
				System.out.println(" no's are greater than 10:="+x);
			}

			//Normal Predicate
			else if (p_isEven.test(x)) {
				System.out.println(" no's are even and less than 10:="+x);
			}

			//Normal Predicate
			else if (p_isEven.negate().test(x)) {
				System.out.println(" no's are not even and less than 10:="+x);
			}
			
			
			if(p_greaterThan10.or(p_isEven).test(x)) 
				System.out.println("no is either than 10 or even:="+ x);

		}
	}
}
