package ArraysQs;

import java.util.Iterator;
import java.util.TreeSet;


public class UncommonCharactersInStrings {
	
	public static void main(String[] args) {
		String s1="characters";
		String s2="alphabets";
		TreeSet<Character> ts=new TreeSet<>();
		TreeSet<Character> ts2=new TreeSet<>();
		
		for(char c:s1.toCharArray()) {
//			System.out.println(c);
			ts.add(c);
		}
		for(char c:s2.toCharArray()) {
//			System.out.println(c);
			ts2.add(c);
		}
		
		TreeSet<Character> ts3=(TreeSet<Character>) ts2.clone();
		
		ts2.removeAll(ts);
//		System.out.println(ts2);
		ts.removeAll(ts3);
//		System.out.println(ts);
		ts.addAll(ts2);
//		System.out.println(ts);
		Iterator itr=ts.iterator();
		String finalString="";
		while(itr.hasNext()) {
			finalString+=itr.next();
		}
		System.out.println(finalString);
	}

}
