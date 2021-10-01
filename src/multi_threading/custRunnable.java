package multi_threading;

public class custRunnable implements Runnable {
	@Override
	public void run() {
		try {
		for(int i=0;i<1000000;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+i);
			if(Thread.interrupted()) {
				throw new InterruptedException();
			}
		}
		}catch(Exception eee){
		eee.printStackTrace();
		}
	}

}
