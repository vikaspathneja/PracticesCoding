package StackQueueQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenOranges {
static class Pair{
	private int x;
	private int y;
	
	public Pair(int x,int y) {
	this.x=x;
	this.y=y;
	}
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
//			int rottenitem=0;
			int freshitem=0;
			boolean alreadytimeflag=false;
			int finalTimeUnit=0;
			String rowColumn[] =br.readLine().split(" ");
			int row =Integer.parseInt(rowColumn[0]);
			int column=Integer.parseInt(rowColumn[1]);
			String inputArr1[]=br.readLine().split(" ");
//			System.out.println(Arrays.toString(inputArr1));
			int count=0;
			Queue<Pair>q=new LinkedList<Pair>();
			int inputArr2[][]=new int[row][column];
			for(int i=0; i<row; i++) {
				for(int j=0;j<column;j++ ) {
					int num=Integer.parseInt(inputArr1[count++]);
					inputArr2[i][j]=num;
					if(num==2) {
						q.add(new Pair(i,j));
//						rottenitem++;
					}
//					if(num==1) {
//						freshitem++;
//					}
				}
				
				
				
			}
			q.add(null);
//			System.out.println(Arrays.deepToString(inputArr2));
		

		
		while(!q.isEmpty()) {
			Pair p=q.peek();
			if(p==null) {
				if(q.size()>1) {
					q.add(null);
					alreadytimeflag=false;
				}
				q.poll();
			}else {
			int ai=p.x;
			int aj=p.y;
			if(isValid(ai+1,aj,row,column) && inputArr2[ai+1][aj]==1) {
				inputArr2[ai+1][aj]=2;
				q.add(new Pair(ai+1,aj));	

				if(!alreadytimeflag) {
					alreadytimeflag=true;
					finalTimeUnit++;
					
				}
			}
			if(isValid(ai,aj+1,row,column) && inputArr2[ai][aj+1]==1) {
				inputArr2[ai][aj+1]=2;
				q.add(new Pair(ai,aj+1));	
				if(!alreadytimeflag) {
					alreadytimeflag=true;
					finalTimeUnit++;
				}
			}
			if(isValid(ai-1,aj,row,column) && inputArr2[ai-1][aj]==1) {
				inputArr2[ai-1][aj]=2;
				q.add(new Pair(ai-1,aj));	
				if(!alreadytimeflag) {
					alreadytimeflag=true;
					finalTimeUnit++;
				}
			}
			if(isValid(ai,aj-1,row,column) && inputArr2[ai][aj-1]==1) {
				inputArr2[ai][aj-1]=2;
				q.add(new Pair(ai,aj-1));	
				if(!alreadytimeflag) {
					alreadytimeflag=true;
					finalTimeUnit++;
				}
			}
			q.poll();
			}	
		}
		boolean finalflag=true;
		for(int i=0; i<row; i++) {
			for(int j=0;j<column;j++ ) {
				
				if(inputArr2[i][j]==1) {
					finalflag=false;
					break;
				}
			}
		}
		
		if(finalflag==false) {
			System.out.println("-1");
		}else {
			System.out.println(finalTimeUnit);
		}
		
		}
		
}
	private static boolean isValid(int ai, int aj,int row,int col) {
		if(ai<0 || aj<0 || ai>=row || aj>=col)
		return false;
		else
			return true;
			
	}
}
