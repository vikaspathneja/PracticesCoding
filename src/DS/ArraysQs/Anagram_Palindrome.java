package DS.ArraysQs;

import java.util.Arrays;

public class Anagram_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="fadsypsdaf";
		int caa[]=new int[26];
		for(char c:s.toCharArray()) {
			if(c=='a') {
				caa[0]++;
				
			}else 
				caa[c-'a']++;
		}
		System.out.println(Arrays.toString(caa));
		
		int oddcount=0;
		for(int no:caa) {
			if(no%2!=0) {
				oddcount++;
				
			}
		}
		if(oddcount>1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		

	}

}
