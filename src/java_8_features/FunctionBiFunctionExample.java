package java_8_features;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;

public class FunctionBiFunctionExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Function<String, Integer>f=x->x.length();
		Function<Integer, Integer>df=x->x*2;
		
		List<String>list=Arrays.asList("first","second");
		for(String s:list) {
			System.out.println(f.andThen(df).apply(s));
		}
		
		
		Future<String> completableFuture = 
				  CompletableFuture.completedFuture("Hello");
		Thread.sleep(2000);
		String result=completableFuture.get();
		System.out.println(result);
		
	}

}
