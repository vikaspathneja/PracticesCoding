package misc;
public class Example {    
     public static void main(String[] args) {        
         int a[] = {10};     
               
  System.out.println("Before calling method: " +a[0]);          
           add(a);      
           
           
      System.out.println("after calling method: " +a[0]);    
         }     
  
 public static void add(int a[]) {   
     a[1]++;  
  }   
  }