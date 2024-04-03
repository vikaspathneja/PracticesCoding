package multi_threading.ExectorServiceExample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExampleExecutorService {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        Random r = new Random();


        Callable<Integer> integerCallable = () -> {
            System.out.println(Thread.currentThread().getName() + " started");
            Thread.sleep(2000);
            int val = r.nextInt(10);
            System.out.println("val=" + val);
            return val * val;
        };


        List<Future<Integer>> futures = executorService.invokeAll(Arrays.asList(integerCallable, integerCallable, integerCallable, integerCallable));
        futures.parallelStream().forEach(future -> {
            System.out.println(Thread.currentThread().getName() + " inside iterator");
            if (future.isDone()) {
                System.out.println(Thread.currentThread().getName() + " task done");
                try {
                    System.out.println("future.get()==" + future.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " task not done yet");
//                        try {
////                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//            if(future.isDone()){
                System.out.println(Thread.currentThread().getName() + "Task retried after wait");
                try {
                    Integer values = future.get(1000, TimeUnit.MILLISECONDS);
                } catch (TimeoutException | InterruptedException | ExecutionException e) {
                    System.out.println(Thread.currentThread().getName() + "Task will be cancelled now as response not received in after retried as well 1 sec");
                    future.cancel(true);
                    if (future.isCancelled()) {
                        System.out.println(Thread.currentThread().getName() + " task cancelled");
                    }
                }
//            }
            }
        });
//        Thread.sleep(50000);
        futures.forEach(future -> {
            try {
                if (future.isDone()) {
                    System.out.println(Thread.currentThread().getName() + " at the end of program when task done");
                    int value = future.get();
                    System.out.println(Thread.currentThread().getName() + " value =" + value);
                }
                if (future.isCancelled()) {
                    System.out.println(Thread.currentThread().getName() + " at the end of program when task cancelled");
                }
            } catch (Exception ee) {
                System.out.println("something got wrong in coding");
            }
        });


    }
}
