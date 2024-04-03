package DS.ArraysQs;

import java.lang.*;
import java.io.*;
class CoPrimePair
 {
	public static void main (String[] args) throws IOException
	 {
	 	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int testCases=Integer.parseInt(br.readLine());
	 while(testCases-->0){
	     int counter=0;
	      int noOfInputs=Integer.parseInt(br.readLine());
	      String inputArr[]=br.readLine().split(" ");
	      for(int i=0; i<noOfInputs;i++){
	          int first=Integer.parseInt(inputArr[i]);
	          if(i<noOfInputs-1){
	          int second=Integer.parseInt(inputArr[i+1]);
	          	
	              int gcdNo=gcd(first,second);
//	              System.out.println("first="+first);
//	              System.out.println("second="+second);
//	              System.out.println("intital gcd ="+gcdNo);
	              
	              if(gcdNo!=1){
	            	if(first==second) {
	            		counter++;
	            	}
	            	else if(second<first)
	               {
	                   int temp=first;
	                   first=second;
	                   second=temp;
	               }
	            	 int inc=first;
	                 while(inc < second ){
	            	  int fgcd=gcd(inc,second);
	            	  int sgcd=gcd(first,inc);
//	                  System.out.println("fgcd="+fgcd);
//	                  System.out.println("sgcd="+sgcd);
//	                  System.out.println();
	            	  if(fgcd==1 && sgcd==1){
	                  counter++;
//            		System.out.println("counter changed="+counter);
	                  break;
	                  }
	                  else
	                  inc++;
	              }
	              }
	          }
	      }
	      System.out.println(counter);
        }
	 }
	 
	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
}