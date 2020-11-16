package rxjavaLearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class CompositeDisposableExample {

	public static void main(String[] args) {

		/**
		 * DisposableObserver is way to create Observer , reason to use
		 * disposableobserver rather than observer is it helps in preventing memory
		 * leaks
		 */
		DisposableObserver<String> dobs = new DisposableObserver<String>() {

			@Override
			public void onComplete() {
				System.out.println("onComplete via DisposableObserver");
			}

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError==" + arg0);
			}

			@Override
			public void onNext(String arg0) {
				System.out.println("onNext via DisposableObserver==" + arg0);
			}
		};
		DisposableObserver<String> dobs2 = new DisposableObserver<String>() {

			@Override
			public void onComplete() {
				System.out.println("onComplete via DisposableObserver");
			}

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError==" + arg0);
			}


			@Override
			public void onNext(String arg0) {
				System.out.println("onNext via DisposableObserver==" + arg0);
			}
		};

		
		
		
		List<String> al = Arrays.asList("first", "second", "third");
		Observable<String> observable = Observable.fromIterable(al);

		/**
		 * CompositeDisposable object helps to dispose multiple disposable observers at once
		 */
		CompositeDisposable cdis=new CompositeDisposable();
		
		cdis.add(dobs);

//		below syntax is for adding schedular with composite disposables
//		cdis.add(
//				observable.subscribeOn(Schedulers.io()).
//				observeOn(Schedulers.io()).
//				subscribeWith(dobs)
//				);
//		
		
		
		observable.subscribe(dobs);
		System.out.println();
		System.out.println("cdis size after added dobs="+cdis.size());

		/**
		 * cids clear method will clear the existing cdis and can accept
		 * further disposables observers and show correct methods values
		 * like disposable observers is disposed or not 
		 */
		System.out.println("before cdis clear");
//		cdis.clear();
		System.out.println("cdis isDisposed=="+cdis.isDisposed());
		
		
		/**
		 * cdis dispose method dispose the cdis and 
		 * change the isDispose method to true
		 * and it can not accept further disposable observers
		 * and it will also show wrong method values like 
		 * disposable observers is disposed or not
		 * for say in this example cdis dispose called after only 
		 * dobs subscribed , after that dobs2 is added to cids 
		 * but still dobs2.isDisposed giving true
		 */
//		cdis.dispose();

		
		
		System.out.println("after cdis clear ");
		System.out.println("cdis size="+cdis.size());
		System.out.println();
		
		
		System.out.println();

		
		
		observable.subscribe(dobs2);

		cdis.add(dobs2);
		
		
//		cdis.add(dobs2);
//		observable.subscribe(dobs2);
		
		/**
		 * do note if we added dobs2 into cids after cids dispose method
		 * then in that cose even subscription itself will not called
		 * so clear will be better options for clearing particular dobs 
		 * rather than dispose method of composite disposable
		 */
		
		
		
		
		System.out.println("cdis size after added dobs2="+cdis.size());
		
		System.out.println("dobs.isDisposed()=="+dobs.isDisposed());
		System.out.println("dobs2.isDisposed()=="+dobs2.isDisposed());
	
		cdis.clear();
		System.out.println();
		System.out.println("after cdis clear");
		System.out.println();
		System.out.println("dobs.isDisposed()=="+dobs.isDisposed());
		System.out.println("dobs2.isDisposed()=="+dobs2.isDisposed());
	
		
		

		
	}

}
