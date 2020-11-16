package rxjavaLearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class DisposableObserverExample {

	public static void main(String[] args) {

		/**
		 * Observer is way to create Observer 
		 */
		
		Observer<String> obs=new Observer<String>() {
			
			@Override
			public void onSubscribe(Disposable arg0) {
				System.out.println("onSubscribe via Observer");
				
			}
			
			@Override
			public void onNext(String arg0) {
				System.out.println("onNext via Observer=="+arg0);
				
			}
			
			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError via Observer");				
			}
			
			@Override
			public void onComplete() {
				System.out.println("onComplete via Observer");				
				
			}
		};
		
		/**
		 * DisposableObserver is way to create Observer ,
		 *  reason to use disposableobserver rather than observer is 
		 *  it helps in preventing memory leaks
		 */
		DisposableObserver<String> dobs=new DisposableObserver<String>() {

			
			@Override
			public void onComplete() {
				System.out.println("onComplete via DisposableObserver");
			}

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError=="+arg0);
			}

			@Override
			public void onNext(String arg0) {
				System.out.println("onNext via DisposableObserver=="+arg0);
			}
		};
		

		List<String> al = Arrays.asList("first", "second", "third");
		Observable<String> observable=Observable.fromIterable(al);

		//subscribe via Observer
		observable.subscribe(obs);
		System.out.println();
		//subscribe via DisposableObserver
		observable.subscribe(dobs);
		/**
		 * DisposableObserver provides a way to dispose/close the subscription 
		 * via dispose method 
		 * and to check whether closed/disposed or not 
		 * isDisposed Method is provided
		 * 
		 * that feature is not provided by Observer
		 */
		System.out.println("disposed or not=="+dobs.isDisposed());
		dobs.dispose();
		System.out.println("DisposableObserver disposed...");
		System.out.println("again checked disposed or not=="+dobs.isDisposed());
		System.out.println();
		
		System.out.println("calling again observable subscribe to check for \nboth Observer & DisposableObserver");
		System.out.println();
		observable.subscribe(obs);
		System.out.println();
		System.out.println("Observer called again but Disposableobserver \n not as already disposed");
		observable.subscribe(dobs);
		
		
		
		

	}

}
