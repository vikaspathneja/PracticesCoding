package rxjavaLearning;

import java.util.concurrent.TimeUnit;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;

public class DisposableExample {

	public static void main(String[] args) {
		
		Disposable obs = s.delay(5, TimeUnit.SECONDS).subscribeWith(new DisposableSingleObserver<String>() {

			@Override
			public void onError(Throwable arg0) {
				System.out.println("onError=" + arg0.getMessage());
			}

			@Override
			public void onSuccess(String arg0) {
				System.out.println("onSuccess arg0=" + arg0);
			}

		});
//		System.out.println(obs.isDisposed());
//		Thread.sleep(7000);

//		obs.dispose();

		
		
		

		
	}

}
