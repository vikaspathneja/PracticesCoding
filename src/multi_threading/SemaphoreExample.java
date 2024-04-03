package multi_threading;

import java.util.concurrent.Semaphore;

class semaphore{
    void sentReceiveSignalviaSemaphore() throws InterruptedException {
        Semaphore semaphore=new Semaphore(0);
        Thread t1=new Thread(()->{
            System.out.println("availablePermits in signal sent before release="+semaphore.availablePermits());
            semaphore.release();
            System.out.println("signal sent");
            System.out.println("availablePermits in signal sent="+semaphore.availablePermits());

        });
        Thread t2=new Thread(()->{
            try {
                System.out.println("availablePermits in signal received before acquire="+semaphore.availablePermits());
                semaphore.acquire();
                System.out.println("availablePermits in signal received="+semaphore.availablePermits());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t1.join();
        Thread.sleep(3000);
        t2.start();
        t2.join();

    }
}

public class SemaphoreExample {
    public static void main(String[] args) throws InterruptedException {
        semaphore semaphore=new semaphore();
        semaphore.sentReceiveSignalviaSemaphore();
    }
}
