package StringDsQuestions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingElementinString {
	public static void main(String[] args) {
		String str="anagram";
		
		LinkedHashMap<Character, Integer>hm=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				int no=hm.get(str.charAt(i));
				no++;
				hm.put(str.charAt(i),no);
			}else {
				hm.put(str.charAt(i),1);
			}
		}
		
		Iterator<Map.Entry<Character, Integer>>itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Character, Integer> s= itr.next();
			if(s.getValue()==1) {
				System.out.println(s.getKey());
			break;
			}
		}
	}
}
