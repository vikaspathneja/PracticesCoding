package java_8_features.cust_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java_8_features.cust_function.FunctionExample;

public class ConsumerExample {
	/*
	 * print items from list list
	 */
	public static Consumer<List<String>>Print_String_From_List_Consumer=x->{
		for (String string : x) {
			System.out.println(string);
		}
	};
	
	
	public static Consumer<List<Integer>>Print_Integer_From_List_Consumer=x->{
		for (Integer string : x) {
			System.out.println(string);
		}
	};
	
	public static void main(String[] args) {
		

		String[] str = { "vikas","sim","kiaan","mohit","vaibhav","asha","gulshan","kkkaaa","aajhhh","bbb","",null,"",null,"","kia"};
		List<String>list=Arrays.asList(str);
		System.out.println("list consumed before null and empty removal");
		Print_String_From_List_Consumer.accept(list);
		System.out.println();
		System.out.println("list consumed after null and empty removal");
		List<String>list2=FunctionExample.notEmptyList.apply(list);
		Print_String_From_List_Consumer.accept(list2);
		
	}
}
