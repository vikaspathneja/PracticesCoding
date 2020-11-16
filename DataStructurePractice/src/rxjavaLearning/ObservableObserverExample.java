package rxjavaLearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableObserverExample {

	public static void main(String[] args) {
		List<String> al = Arrays.asList("first", "second", "third");

		Observer<String> observor = new Observer<String>() {

			@Override
			public void onSubscribe(Disposable arg0) {
				System.out.println("onSubscribe==");
//				arg0.dispose();
			}

			@Override
			public void onNext(String arg0) {
				System.out.println("onNext=="+arg0);
				// TODO Auto-generated method stub

			}

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError=="+arg0);

			}

			@Override
			public void onComplete() {
				System.out.println("onComplete==");
			}
		};
		Observable<String> observable=Observable.fromIterable(al);
		observable.subscribe(observor);

	}

}
