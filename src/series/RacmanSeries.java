package series;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RacmanSeries {

	public static void main(String[] args) {
	int noTillSeriestoBeCalculate=100;
	ArrayList<Integer>seriesList=new ArrayList<>();
	seriesList.add(0);
	int next=0;
	HashMap<Integer,Boolean>hm=new HashMap<>();
	hm.put(0, true);
	for(int i=1; i<=noTillSeriestoBeCalculate; i++) {
//		System.out.println("i="+i);
//		System.out.println("next="+next);
		int flag=next-i;
//		System.out.println("backstep="+flag);
		//below condition is when we cant go back
//		System.out.println("hm=="+hm);
		if(flag<0 || hm.containsKey(flag)) {
			next=next+i;
			System.out.println("next="+next);
		}
		//condition when we can go back to previous step
		else {
			next=flag;
		}
		System.out.println("-------");
		hm.put(next, true);
		seriesList.add(next);
	}
	System.out.println(seriesList);
		
	}

}
