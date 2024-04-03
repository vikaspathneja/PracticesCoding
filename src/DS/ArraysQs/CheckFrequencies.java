package DS.ArraysQs;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CheckFrequencies {

	public static void main(String[] args) {
		String s = "vikspathneja";
		HashMap<Character,Integer> hm = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>>es=hm.entrySet();
		int count=0;
		int sum=0;
		for(Entry e:es) {
			sum+=(int)e.getValue();
			count++;
		}
		sum-=1;
		if(sum%count==0)
			System.out.println("1");
		else
			System.out.println("0");
		

	}
	
	
	

}
