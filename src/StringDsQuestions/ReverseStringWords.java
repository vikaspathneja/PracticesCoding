package StringDsQuestions;

import java.util.Arrays;
import java.util.*;


public class ReverseStringWords {
	public static void main(String[] args) {
		
		//This Function Reverse the String Words 
		//input: i.like.this.program.very.much
		//output: much.very.program.this.like.i
		
		String S="i.like.this.program.very.much";
		 String[] arr=S.split("\\.");
	        System.out.println(Arrays.toString(arr));
		 	StringBuilder sb=new StringBuilder();
	        for(int i=arr.length-1;i>=0;i--){
//	            System.out.println(arr[i]);
	            if(i!=0)
	            sb.append(arr[i]+".");
	            else
	            sb.append(arr[i]);
	            	
	        }
//	         String str=sb.toString().substring(0,sb.length());
	        System.out.println(sb.toString());
	        }
}
