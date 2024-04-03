package multi_threading;

import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.Executor;

public class DumbExecutor {
    public static void main(String[] args) {
        TimerTask badtask=new TimerTask() {
            @Override
            public void run() {
                try {
                    System.out.println("hello by badtask");
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        TimerTask goodtask=new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }

        };
        Timer time=new Timer();
        time.schedule(badtask,100);
        time.schedule(goodtask,300);
    }
}
