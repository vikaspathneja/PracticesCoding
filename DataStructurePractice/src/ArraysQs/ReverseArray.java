package ArraysQs;

import java.io.*;
class ReverseArray
 {
	public static void main (String[] args) throws IOException
	 {
	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int t = Integer.parseInt(br.readLine()); 
	  while (t-- > 0) { 
            String line = br.readLine();
            String[] arrayInput = line.trim().split("\\s+"); 
            int noOfInputs=Integer.parseInt(arrayInput[0]);
            int windowSize=Integer.parseInt(arrayInput[1]);
            
            // System.out.println("line=="+line);
			int arr[] = new int[noOfInputs]; 
			String line2 = br.readLine(); 
            String[] strs = line2.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < noOfInputs; i++) 
                arr[i] = Integer.parseInt(strs[i]); 
                
	        reverse(arr,windowSize);
	           for(int x:arr){
	               System.out.print(x+" ");
	               
	           } 
	           
	     System.out.println();        
	       
	 }
}
public static void reverse(int arr[],int windowSize){
	int li=0;
	int hi=arr.length;
	int winSize=windowSize;
	while(li<=hi-windowSize) {
	reverseArrayNew(arr,li,windowSize-1);
	li+=windowSize;
	}
        
}


public static void reverseArrayNew(int arr[],int li,int windowSize){
    int hi=li+windowSize;
    while(li<hi){
    int x=arr[li];
    arr[li]=arr[hi];
    arr[hi]=x;
    li++;
    hi--;
    }
}

 }