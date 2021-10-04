package java_8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import JavaConceptExamples.Employee;

public class StreamBuildingExample3 {

	public static void main(String[] args) {
		Random r=new Random();
		List<Integer>list=new ArrayList<>(10000);
		for(int i=0;i<10000;i++)
			list.add(r.nextInt(10000));
		
		long count=list.stream().filter(x->
		{
			System.out.println("value ="+x);
			return x%2==0;
		
		}
		).map(x->{System.out.println("%2=0=="+x);return x;}).count();
		
		System.out.println("count==="+count);
		
	}

}
