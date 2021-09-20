package java_8_features.cust_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
	public static Predicate<String>p_notEmpty=x->x!=null && x.length()>0;
	public static String[] str = { "vikas","sim","kiaan","mohit","vaibhav","asha","gulshan","kkkaaa","aajhhh","bbb","",null,"",null,"","kia"};
	
	
	public static Function<List<String>, List<String>> notEmptyList= x-> {
		List<String>lll=new ArrayList<String>();	
		for(String s:x) {
				if(p_notEmpty.test(s))
					lll.add(s);
			};
			return lll;
	};
	
	public static Function<List<String>,List<String>> identityFunction=Function.identity();
	public static Function<String,String>StrFun=Function.identity();
	
	
	public static void main(String[] args) {
		List<String>newlist=notEmptyList.apply(Arrays.asList(str));
		for (String string : newlist) {
			System.out.println(string);
		}
		
		List<String>nnnn=identityFunction.apply(newlist);
		nnnn.set(0, "simran");
		System.out.println(newlist);
		String vikas=StrFun.apply("vikas");
		System.out.println(vikas=="vikas");
		
		
		
		
	}
}
