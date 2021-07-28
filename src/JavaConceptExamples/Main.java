package JavaConceptExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class Main
{
     public static void main(String[] args){
//          Foo f = new Foo("f");
//          changeReference(f); // It won't change the reference!
//          modifyReference(f); // It will change the object that the reference variable "f" refers to!
//          System.out.println(f.getAttribute());
//     
    	 
    	 
    	 Date d=new Date(1627457395828L);
    	 System.out.println(d);
    	 
         ArrayList<String> a=new ArrayList<>();
         a.add("first");
         a.add("second");
         ArrayList<String>b=new ArrayList<String>(a);
         System.out.println(b.get(0));
         System.out.println(b.get(1));
         a.set(0, "third");
         a.remove(0);
         a=null;
         System.out.println(b.get(0));
         System.out.println(b.get(1));
         
         long aaaa=((20+30))-4*5^2/10;
         System.out.println("===aaaa="+aaaa);
     
         
         String s1="vikas";
         String s2=s1;
         System.out.println(s2==s1);
         s1=null;
         System.out.println(s2==s1);
         
         String s5=new String("ABC");
         String s6="ABC";
         
         System.out.println(s5==s6);
         System.out.println(s5.equals(s6));
         
         
         
         
         
     }
     public static void changeReference(Foo a) {
          Foo b = new Foo("b");
          a = b;
     }
     public static void modifyReference(Foo c) {
          c.setAttribute("c");
     }
     
     
//    Object []objArr=new Object[100];
//    String[] strArr=new String[100];
     
     
     
     
}