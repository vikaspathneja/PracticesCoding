package rxjavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;

public class FirstExample {

	public static void main(String[] args) throws InterruptedException {
		List<String> al = new ArrayList<String>();
		Flowable.just(al).subscribe(res -> {
			System.out.println(res);
		});

		Single<String> s = Single.just("First");

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
