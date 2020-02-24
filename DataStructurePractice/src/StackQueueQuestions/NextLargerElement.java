package StackQueueQuestions;
//new comment added
import java.lang.*;
import java.util.HashMap;
import java.util.Stack;
import java.io.*;
public class NextLargerElement
 {
	public static void main (String[] args) throws IOException
	 {
	 
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		int testCases=Integer.parseInt(br.readLine());
		while(testCases-->0) {
			int noOfInputs=Integer.parseInt(br.readLine());
			String inputArr[]=br.readLine().split(" ");
			Stack<Integer> stack=new Stack<Integer>();
			int resCount=0;
// 			int resultArr[]=new int[100000];
HashMap<Integer,Integer>hm=new HashMap<>();
				stack.push(Integer.parseInt(inputArr[0]));
			for(int i=1; i<inputArr.length; i++) {
				// System.out.println("stack="+stack.toString());
				// System.out.println("resultArr="+Arrays.toString(resultArr));
				int no=Integer.parseInt(inputArr[i]);	
			
			
					while(!stack.isEmpty()) {
						int popped=stack.pop();
						if(no>popped){
					   // System.out.print(no+" ");
					   // resultArr[popped]=no;
					   hm.put(popped,no);
				// 		break;
						}
						else {
						stack.push(popped);
						break;
						}
					
			
				}
					
					
					stack.push(no);
					
					
			}
			
		    while(!stack.isEmpty()){
		      //   resultArr[stack.pop()]=-1;
		      hm.put(stack.pop(),-1);
		      //  System.out.print("-1"+" ");
		    }
		for(int i=0; i<inputArr.length;i++){
		    System.out.print(hm.get(Integer.parseInt(inputArr[i]))+" ");
		}
		
// 			for(int i=0; i<resCount; i++){
// 			    System.out.print(resultArr[i]+" ");
// 			}
			System.out.println();
// 			System.out.println("result Arr="+Arrays.toString(resultArr));
// 			System.out.println("stack="+stack);

//			resultArr[resCount++]=-1;
		}
		
	
	 }
}