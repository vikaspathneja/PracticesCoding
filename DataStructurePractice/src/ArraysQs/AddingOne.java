package ArraysQs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AddingOne {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 int test=sc.nextInt();
		 while(test-->0)
		 {
		     int n=sc.nextInt();
		     int a[]=new int[n];
		     for(int i=0;i<n;i++)
		     {
		         a[i]=sc.nextInt();
		     }
		  int ans[]= plusOne(a);
		 // if(n==856)
		 //int c=0;
		 int j=0;
		 while(j<n&&a[j]==0)
		 {
		   j++;  
		 }
		   
	   	  //System.out.print("0 ");
		
		  StringBuilder sb=new StringBuilder();
		  for(int i=0;i<j;i++)
		  sb.append("0 ");
		  for(int i=0;i<ans.length;i++)
		  sb.append(ans[i]+" ");
		     System.out.println(sb);
		 }
		 
//		addingOneSecond();
	}
	
	private static void addingOneFirst() {

		String s="1 9 9 9 9";
		String arr[]=s.split(" ");
		int arrlength=arr.length;
		int no=0;
		boolean flag=false;
		while(arrlength-->0) {
		no=Integer.parseInt(arr[arrlength]);
		no+=1;
		
		if(no<10) {
			arr[arrlength]=String.valueOf(no);
			break;
		}else  {
			no=no%10;
			arr[arrlength]=String.valueOf(no);
			if(arrlength==0) {
				flag=true;
			}
			
		}
		
		}
		
		if(flag==true) {
			String finalstring="1";
			for(String s3:arr) {
				finalstring+=s3+" ";
			}
		System.out.println(finalstring);
		}			
		else {
			String finalstring="";
			for(String s3:arr) {
				finalstring+=s3+" ";
			}
			System.out.println(finalstring);
		}
	}

	private static void addingOneSecond() {

//		String s="4 0 7 2 4 1 5 5 6 0 3 2 1 0 0 4 0 7 8 4 5 7 6 7 1 1 8 0 0 7 1 1 0 1 0 4 2 7 4 7 6 8 7 8 1 6 2 1 8 1 3 0 2 3 4 2 5 4 3 0 5 6 1 5 6 4 5 5 2 6 1 0 4 8 3 4 1 6 0 0 8 2 1 0 6 8 5 1 3 5 6 2 0 5 6 4 1 8 6 8 5 3 6 5 0 4 1 6 4 6 2 0 5 2 4 6 8 5 6 8 8 8 5 5 7 4 3 2 8 5 6 8 3 4 2 1 4 2 3 2 8 7 5 2 5 4 5 7 1 6 8 8 7 7 6 5 6 2 2 8 5 6 8 7 0 1 8 2 3 8 0 8 7 1 4 4 1 4 0 1 7 7 7 2 8 0 7 0 6 3 0 5 4 7 5 8 1 4 6 0 3 3 4 2 1 7 5 6 5 1 0 0 8 6 4 6 3 0 4 1 0 7 7 2 2 0 1 1 0 5 8 6 7 7 0 4 5 5 6 2 5 0 0 5 5 2 6 5 7 8 5 4 4 4 3 1 8 5 1 5 5 1 6 5 7 4 1 0 3 6 4 2 7 4 4 4 1 3 6 3 5 6 2 3 6 7 8 4 8 8 7 0 5 5 4 4 1 5 7 2 0 0 6 7 5 4 7 8 5 2 2 1 2 5 7 8 8 5 1 5 6 2 8 4 6 6 1 5 3 7 4 2 3 5 8 6 4 3 5 3 3 2 6 2 4 8 5 1 6 0 4 7 3 5 6 3 3 3 2 5 1 8 7 0 4 3 2 8 2 6 3 6 2 6 5 5 4 3 1 4 4 1 4 5 5 3 8 5 6 5 0 3 4 5 0 5 6 6 3 0 6 0 3 3 3 5 4 1 5 4 6 2 3 2 7 4 2 1 8 5 3 7 8 4 5 8 4 8 5 6 2 6 4 2 6 8 7 3 2 6 1 2 1 8 5 7 1 8 7 3 4 5 4 1 2 5 0 1 8 5 8 0 5 5 7 4 5 5 5 0 2 3 5 2 2 4 6 4 0 0 4 7 2 2 2 2 5 8 4 4 6 3 1 4 5 1 8 3 .................";
		String s="4 0 7 2 4 1 5 5 6 0 3 2 1 0 0 4 0 7 8 4 5 7 6 7 1 1 8 0 0 7 1 1 0 1 0 4 2 7 4 7 6 8 7 8 1 6 2 1 8 1 3 0 2 3 4 2 5 4 3 0 5 6 1 5 6 4 5 5 2 6 1 0 4 8 3 4 1 6 0 0 8 2 1 0 6 8 5 1 3 5 6 2 0 5 6 4 1 8 6 8 5 3 6 5 0 4 1 6 4 6 2 0 5 2 4 6 8 5 6 8 8 8 5 5 7 4 3 2 8 5 6 8 3 4 2 1 4 2 3 2 8 7 5 2 5 4 5 7 1 6 8 8 7 7 6 5 6 2 2 8 5 6 8 7 0 1 8 2 3 8 0 8 7 1 4 4 1 4 0 1 7 7 7 2 8 0 7 0 6 3 0 5 4 7 5 8 1 4 6 0 3 3 4 2 1 7 5 6 5 1 0 0 8 6 4 6 3 0 4 1 0 7 7 2 2 0 1 1 0 5 8 6 7 7 0 4 5 5 6 2 5 0 0 5 5 2 6 5 7 8 5 4 4 4 3 1 8 5 1 5 5 1 6 5 7 4 1 0 3 6 4 2 7 4 4 4 1 3 6 3 5 6 2 3 6 7 8 4 8 8 7 0 5 5 4 4 1 5 7 2 0 0 6 7 5 4 7 8 5 2 2 1 2 5 7 8 8 5 1 5 6 2 8 4 6 6 1 5 3 7 4 2 3 5 8 6 4 3 5 3 3 2 6 2 4 8 5 1 6 0 4 7 3 5 6 3 3 3 2 5 1 8 7 0 4 3 2 8 2 6 3 6 2 6 5 5 4 3 1 4 4 1 4 5 5 3 8 5 6 5 0 3 4 5 0 5 6 6 3 0 6 0 3 3 3 5 4 1 5 4 6 2 3 2 7 4 2 1 8 5 3 7 8 4 5 8 4 8 5 6 2 6 4 2 6 8 7 3 2 6 1 2 1 8 5 7 1 8 7 3 4 5 4 1 2 5 0 1 8 5 8 0 5 5 7 4 5 5 5 0 2 3 5 2 2 4 6 4 0 0 4 7 2 2 2 2 5 8 4 4 6 3 1 4 5 1 8 3";
		StringBuilder sb=new StringBuilder(s);
		boolean flag=false;
		for(int i=s.length()-1; i>=0; i--) {
			char c=s.charAt(i);
			int no=((Integer.valueOf(c))-48);
			//System.out.println("no=="+no);
			if(no>0) {
				no+=1;
				if(no>=10) {
					no=no%10;
					char nc=(char)(no+48);
					sb.setCharAt(i, nc);
					if(i==0) {
						flag=true;
					}
				}else {
//					System.out.println(sb.charAt(i));
					char nc=(char)(no+48);
					sb.setCharAt(i, nc);
					break;
					
				}
			}
			
		}
		if(flag==true) {
			String finals="1 "+sb.toString();
			System.out.println(finals);
		}else {
		System.out.println(sb.toString());
		}
	}
		     
	public static int[] plusOne(int[] A) {
		        
		        int carry = 1;
		            int n = A.length;
		            int value,sum;
		            int[] result = new int[n+1];  
		            for(int i =n-1;i>=0;i--){
		            sum = (A[i]+carry);
		            value = sum%10;
		            carry = sum/10;
		            result[i+1] = value;
		            
		            }
		            
		            if( carry !=0){
		            result[0] = carry;
		            
		            }
		            int counter =0;
		            
		            for(int k =0;k<result.length;k++)
		            {
		            if(result[k]!=0){
		            break;}
		            counter++;
		            }
		            if(counter>0){
		            int[] resarr= new int[result.length-counter];
		            for(int i=0; i<result.length-counter;i++){
		            resarr[i] = result[i+counter];
		            }
		            return resarr;
		            }
		            return result;
		        
		    }
			
		}
	

