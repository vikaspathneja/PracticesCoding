package ArraysQs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstElementOccur_K_Times {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		String s="1 7 4 3 4 8 7";
		int no=2;
		String finalkey="-1";
		String arr[]=s.split(" ");
		
		for(String x:arr) {
			if(!hm.containsKey(x)) {
				hm.put(x,1);	
			}else {
				hm.put(x,hm.get(x)+1);
			}
			
		}
		Set<Entry<String, Integer>>es=hm.entrySet();
		for(Entry e:es) {
//			System.out.println(e.getKey());
			int value=(int) e.getValue();
			if(value==no) {
				finalkey=(String) e.getKey();
				break;
			}
		}
		System.out.println(finalkey);
		
	}

}
