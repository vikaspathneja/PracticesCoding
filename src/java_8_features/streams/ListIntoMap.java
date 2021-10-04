package java_8_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<1000;i++) {
			list.add(i);
		}
		
		Map<Integer,String>map=list.stream().collect(Collectors.toMap(x->x, y->"vikas"+y));
		map.forEach((x,y)->{
			System.out.println("Key="+x);
			System.out.println("Value="+y);
		});
	}
}
