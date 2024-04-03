package JavaConceptExamples;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

class temp{
    public Random random=new Random(1000);
    public CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>();
    public void addItemsinList(CopyOnWriteArrayList<Integer> list,Random r) {
        Thread t =new Thread(()->{
            try {
                System.out.println("inside add item in child thread");
                Thread.sleep(1000);
                list.add(r.nextInt());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
    }
}
public class CopyonWriteArrayListExample {

    public static void main(String[] args) throws InterruptedException {
        temp t=new temp();
        t.addItemsinList(t.list,t.random);
        t.list.iterator();
        Thread.sleep(5000);
        System.out.println(t.list);
    }


}
