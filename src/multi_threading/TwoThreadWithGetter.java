package multi_threading;
class Other{
    Boolean other = new Boolean(true);
    public void example() throws InterruptedException {
        {
            Thread t1 =new Thread(() -> {
                synchronized (other){
                    while(other){
                        System.out.println(Thread.currentThread().getName()+" thread going to execution as other is ="+other);
                        try {
//                            Thread.sleep(5000);
                            System.out.println((System.currentTimeMillis()/1000)+"---"+Thread.currentThread().getName()+" thread before wait  ="+other);
//                            other.wait();
                            System.out.println(Thread.currentThread().getName()+" after wait  ="+other);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    other=false;
                    System.out.println((System.currentTimeMillis()/1000)+"---"+Thread.currentThread().getName()+" value of other updated to ="+other);
                }
            });
            t1.start();
            Thread.sleep(1000);
            t2.start();;
            t1.join();
            t2.join();
        }
    }
}
public class TwoThreadWithGetter {

    public static void main(String[] args) throws InterruptedException{
        Other other=new Other();
        other.example();
    }
}
