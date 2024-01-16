package java_8_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {
	public static void main(String[] args) {
//		List<Integer>list=new ArrayList<Integer>();
//		for(int i=0;i<1000;i++) {
//			list.add(i);
//		}
//		
//		Map<Integer,String>map=list.stream().collect(Collectors.toMap(x->x, y->"vikas"+y));
//		map.forEach((x,y)->{
//			System.out.println("Key="+x);
//			System.out.println("Value="+y);
//		});
		
		
		
		List<String>mlist=new ArrayList<>();
		mlist.add("aa");
		mlist.add("aaa");
		mlist.add("bb");
		mlist.add("cc");
		mlist.add("aa");
		mlist.add("ccc");
		

		
		Map<String, Integer> map = mlist.stream()
                .collect(Collectors.toMap(
                        String::toString,
                        s -> 1,
                        Integer::sum
                ));
		System.out.println(map);

	}
}
