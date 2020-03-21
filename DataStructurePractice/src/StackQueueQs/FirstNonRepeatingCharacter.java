package StackQueueQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while (testCases-- > 0) {
			Queue<Character> q = new LinkedList<Character>();
			int[] charArr = new int[26];
			int noOfInputs = Integer.parseInt(br.readLine());
			String[] inputArr = br.readLine().split(" ");
			for (int i = 0; i < noOfInputs; i++) {
				char no = inputArr[i].toCharArray()[0];
				charArr[no - 97]++;
				q.add(no);
					while (!q.isEmpty()) {
						char c = q.peek();
						if (charArr[c - 97] == 1){
							System.out.print(c+" ");
							break;
						}else {
							q.poll();
						}
					}
					if(q.isEmpty()) {
						System.out.print("-1 ");
					}	
//				}
				
			}
			System.out.println();
		}
	}
}
