package multi_threading;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(2);
        Thread A=new Thread(()->{
            Thread.currentThread().setName("A");
            System.out.println("Thread A executing");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latch.countDown();
        });
        Thread B=new Thread(()->{
            Thread.currentThread().setName("B");
            System.out.println("Thread B executing");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latch.countDown();
        });
        A.start();
        B.start();
        latch.await();
        newmethod(latch);
//        latch.await();
        System.out.println("main executed");
        System.out.println("latch.getCount()="+latch.getCount());
    }

    private static void newmethod(CountDownLatch latch) {
        Thread B=new Thread(()->{
            Thread.currentThread().setName("newmethod thread");
            System.out.println("Thread newmethod thread executing");
            System.out.println(latch.getCount());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latch.countDown();
        });
        B.start();
    }
}
