package StringDsQuestions;

import java.util.Stack;

public class isTwoStringAnagram {
	public static void main(String[] args) {
		boolean isAnagram=isAnagram("first","secod");
//		System.out.println("isAnagram="+isAnagram);
		int [] count=new int[2];
		count[0]++;
		System.out.println(count[0]);
		Stack<Character>stack=new Stack<>();
	}
	
	 public static boolean isAnagram(String s, String t) {
	       /* static final int CHAR=256;*/
	        if(s.length()!=t.length())
	        return false;
	        int count[]=new int[26];
	        int i=0;
	        while(i<s.length())
	        {
//	        	int no=s.charAt(i)-'a';
//	        	System.out.println("s.charAt(i)-a==="+no);
	        	count[s.charAt(i)-'a']++;
	        	System.out.println("count vale=="+count[s.charAt(i)-'a']);
//	        	System.out.println("count vale--"+count[t.charAt(i)-'a']);
//	            count[s.charAt(i)-'a']++;
//	            count[t.charAt(i)-'a']--;
	            i++;
	        }
	        for(i=0;i<26;i++)
	        {
	            if(count[i]>0)
	            return false;
	        }
	        return true;
	      }
}
