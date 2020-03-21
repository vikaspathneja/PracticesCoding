package StackQueueQuestions;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxOfAllSubArrayOfKSize {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
//		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringBuffer sb=new StringBuffer();
			
			Deque<Integer> dq = new LinkedList<Integer>();
			int noOfInputs =sc.nextInt();
			int windowSize=sc.nextInt();
//			String myArr[] = br.readLine().trim().split(" ");
//			int noOfInputs = Integer.parseInt(myArr[0]);
//			int windowSize = Integer.parseInt(myArr[1]);
			int windowMaxArr[] = new int[noOfInputs];
			int count = 0;
			int inputArr[] = new int[noOfInputs];
//			String inputArr[] = br.readLine().trim().split(" ");
			for (int i = 0; i < noOfInputs; i++) {
//				int num=Integer.parseInt(inputArr[i]);
				inputArr[i]=sc.nextInt();
				int num=inputArr[i];
//				int cw=i%windowSize;
//				if(cw==0) {
//					System.out.print(inputArr[dq.getFirst()]+" ");
//				sw=i-windowSize;
//				while(dq.getFirst()<=sw) {
//					dq.removeFirst();
//				}
//				}
				
				if(i>=windowSize) {
					sb.append(inputArr[dq.getFirst()]+" ");
//					System.out.print(inputArr[dq.getFirst()]+" ");
					if( (dq.getFirst()<=i-windowSize) && (!dq.isEmpty())) {
					dq.removeFirst();
				}
					
				}
				if(!dq.isEmpty()) {
				int lastdqele=inputArr[dq.getLast()];
				if(lastdqele<num) {
				while((lastdqele<num) && !dq.isEmpty()) {
					dq.removeLast();
					if(!dq.isEmpty())
					lastdqele=inputArr[dq.getLast()];
				}
				}
				dq.addLast(i);
				
				}else {
					dq.addLast(i);
				}
					
				
			
			}
			if(!dq.isEmpty()) {
				sb.append(inputArr[dq.getFirst()]+" ");
			}
			System.out.println(sb.toString());
//			System.out.println();
		}
	}
}
