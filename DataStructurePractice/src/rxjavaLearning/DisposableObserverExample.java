package rxjavaLearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class DisposableObserverExample {

	public static void main(String[] args) {
		DisposableObserver<String> d=new DisposableObserver<String>() {

			@Override
			public void onComplete() {
				System.out.println("onComplete");
			}

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError=="+arg0);
			}

			@Override
			public void onNext(String arg0) {
				System.out.println("onNext=="+arg0);
			}
		};
		List<String> al = Arrays.asList("first", "second", "third");
		Observable<String> observable=Observable.fromIterable(al);
		observable.subscribe(d);

		
		

	}

}
