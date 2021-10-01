package java_8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import JavaConceptExamples.Employee;
import java_8_features.cust_consumer.ConsumerExample;

public class StreamBuildingExample {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4);
		
		Stream<Integer> stream=list.stream();
		List<Integer>listOfSortedNo=stream.sorted().collect(Collectors.toList());
		System.out.println("natural sorting of nos="+listOfSortedNo);

		
		Comparator<Integer> descendingComparator=(x,y)->-x.compareTo(y);
		List<Integer>listOfSortedByComparator=list.stream().sorted(descendingComparator).collect(Collectors.toList());
		System.out.println("descending sorting of nos by comparator="+listOfSortedByComparator);

		
		long countOfItems=list.stream().count();
		System.out.println("countOfItems="+countOfItems);
		
		int minOfItems=list.stream().min(descendingComparator).get();
		System.out.println("minOfItems="+minOfItems);
		
		ConsumerExample.Print_Integer_From_List_Consumer.accept(list);
		
		//		s.forEach(e->System.out.println(e));
		
		
//		below stream is to get the max no from stream 
//		Optional<Integer> no=s.max((a,b)->{return a>b?1:a==b?0:-1;});
//		int value=no.get();
//		System.out.println(value);
		
		
//		below stream method is to remove duplicates
//		List<Integer>list=s.distinct().collect(Collectors.toList());
//		System.out.println(list.size());
		
		
//		below stream is to apply predicate/some condition with the help of filter 
//		List list=s.filter(item->item>5).collect(Collectors.toList());
//		System.out.println(list);
		
		
//		below stream method return boolean value if predicate condition match,also it will not check all, once any conditon true it will return
//		boolean status=stream.anyMatch(i->i>100);
//		System.out.println(status);
		
//		reverse of above condition
//		boolean status=stream.noneMatch(i->i>100);
//		System.out.println(status);
		
		
		
		
		
//		filter objects based on their values /based on some conditon apply on their values
//		List<Employee> listOfEmployees=Arrays.asList(
//				new Employee("vikas", 10000),
//				new Employee("mohit", 20000)
//				);
//		Stream<Employee> objStream=listOfEmployees.stream();
//		List<Employee> l=objStream.filter(e->!e.getEname().startsWith("v")).collect(Collectors.toList());
//		System.out.println(l);

		


		List<Employee> listOfEmployees=Arrays.asList(
				new Employee("vikas", 10000),
				new Employee("vikas", 10000),
				new Employee("vaibhav", 30000)
				
				);
		Stream<Employee> objStream=listOfEmployees.stream();

//		grouping of object by their properties
//		objStream.collect(Collectors.groupingBy(i->i.getSalary())).forEach((x,y)->{System.out.println(x+" "+ y);});

		
		
//		getting average salary of list of objects having property salary
//		double avgSalary= objStream.collect(Collectors.averagingInt(c->c.getSalary()));
//		System.out.println(avgSalary);		
		
		
//		summarizing object from salary properties 
//		IntSummaryStatistics intSummary=objStream.collect(Collectors.summarizingInt(x->x.getSalary()));
//		System.out.println(intSummary);		
		
		
		
//		Map<String, Integer> intSummary=objStream.collect(Collectors.toMap(Employee::getEname, Employee::getSalary, (x1,x2)->" "+x1+" "+x2+" "));
//		System.out.println(intSummary);			
		
		
		
		
//		List list=(List) s.collect(Collectors.toList());
//		System.out.println(list);
//
//		System.out.println(list);

		
//		Set set=(Set)s.distinct().collect(Collectors.toSet());
//		System.out.println(set);
	
	
	}

}
