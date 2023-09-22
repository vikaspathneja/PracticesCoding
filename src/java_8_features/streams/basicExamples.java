package java_8_features.streams;

import java.util.Arrays;
import java.util.List;

public class basicExamples {
	public static void main(String[] args) {
		List<Integer> integerList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> courseList=Arrays.asList("Spring","AWS","AZURE","GCLOUD","ab");
		//odd no in the list
		integerList.stream().filter(x->x%2!=0).forEach(System.out::println);
		//cube of odd no in the list
		integerList.stream().filter(x->x%2!=0).map(x->x*x*x).forEach(System.out::println);
		//get courses from list having name spring 
		courseList.stream().filter(x->x.contains("Spring") || x.contains("spring")).forEach(System.out::println);
		//get courses from list having lenght > or equal to  4
		courseList.stream().filter(x->x.length()>=4).forEach(System.out::println);
		//print no of characters in the course list
		courseList.forEach(x->System.out.println(x.length()));
		
	}
}
