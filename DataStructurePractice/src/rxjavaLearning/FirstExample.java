package rxjavaLearning;

import io.reactivex.Flowable;


public class FirstExample {

	public static void main(String[] args) throws InterruptedException {
		Flowable.just("FirstObservableSubscribed").subscribe(res -> {System.out.println(res);});

	}

}
