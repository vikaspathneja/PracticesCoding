package rxjavaLearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;


public class FirstExample {

	public static void main(String[] args) throws InterruptedException {
		Flowable.just("FirstObservableSubscribed").subscribe(res -> {System.out.println(res);});

		List<String> al = Arrays.asList("first", "second", "third");
		Observable<String> observable=Observable.fromIterable(al);
		Consumer<Object> c=value->System.out.println(value);
		observable.subscribe(c);
		
		
		Observable<Integer>obs=Observable.range(0, 10);
		obs.subscribe(c);
		
		
		
	}

}
