package multi_threading;

import java.util.concurrent.*;

public class CompletableFutureExample {

    public static void main(String[] args) throws Exception {
        callajds();
    }

    private static void callajds() throws ExecutionException, InterruptedException {
        ExecutorService executor=Executors.newFixedThreadPool(1);
       FutureTask f=new FutureTask<>(()->"hello");
       Future ff=executor.submit(f);
        System.out.println("future value="+ff.get());
        System.out.println("future task value="+f.get());
//        ExecutorCompletionService
    }


}
