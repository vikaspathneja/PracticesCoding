package java_8_features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import JavaConceptExamples.Employee;


public class StreamBuildingExample2 {
	
	private static double getAverage(Employee student){
        return student.getList().stream().mapToInt(Subject::getScore).average().orElse(0);
        }

	
	public static void main(String[] args) {
	
		
		List<Subject>list1 =Arrays.asList(new Subject("eng",100));
		List<Subject>list2 =Arrays.asList(
				new Subject("eng",100)
				,
				new Subject("hindi",200)
				);
		List<Subject>list3 =Arrays.asList(
				new Subject("eng",100)
				,
				new Subject("hin",200)
				,
				new Subject("math",300)
				);
		List<Subject>list4 =Arrays.asList(
				new Subject("eng",100)
				,
				new Subject("hin",200)
				,
				new Subject("math",300)
				,
				new Subject("sci",400)
				);
		List<Subject>list5 =Arrays.asList(
				new Subject("eng",10)
				,
				new Subject("hin",10)
				,
				new Subject("math",10)
				,
				new Subject("sci",10)
				,
				new Subject("ss",10)
				);
		
		
		
		List<Employee> listOfEmployees=Arrays.asList(
				new Employee("vikas1", 10000,list1),
				new Employee("vikas2", 20000,list2),
				new Employee("vikas3", 30000,list3),
				new Employee("vikas4", 40000,list4),
				new Employee("vikas5", 50000,list5),
				new Employee("mikas6", 60000,list1),
				new Employee("mikas7", 70000,list2),
				new Employee("mikas8", 80000,list3),
				new Employee("mikas9", 90000,list4),
				new Employee("mikas10", 100000,list5),
				new Employee("mikas11", 110000,list1),
				new Employee("mikas12", 120000,list2)
//				
				);
					Comparator<Employee> averageMarkComparator = (firstStudent, secondStudent) -> {
					return -Double.compare(getAverage(firstStudent), getAverage(secondStudent));
					};
			
				List<Employee>sortedListOfEmployessWithAvgOfMarksDesc=listOfEmployees.stream().filter(x->x.getEname().startsWith("v"))
				.sorted(averageMarkComparator).collect(Collectors.toList()).subList(0, 1);
				System.out.println("sortedListOfEmployessWithAvgOfMarksDesc:"+sortedListOfEmployessWithAvgOfMarksDesc);
				
				
				
				
				List<Employee>sortedlist2=listOfEmployees.stream().filter(x->x.getEname().startsWith("v"))
						.collect(
								Collectors.toMap(
										x->x, 
										x->x.getList().stream().mapToInt(y->y.getScore()).average().orElse(0)
										)
								).entrySet().stream().sorted(Map.Entry.comparingByValue()).map(z->z.getKey()).collect(Collectors.toList());
				
				System.out.println("sortedlist2:"+sortedlist2);
//				.sor(
//						
//						x->
//						{
//						double avgValue=x.getListOfSubjects().stream().mapToInt(y->y.getSmarks()).average().orElse(0);
//						
//						}
//						)
//		.collect(
//				Collectors.toList()
//				);
//		
//		System.out.println(lll);

//		grouping of object by their properties
//		objStream.collect(Collectors.groupingBy(i->i.getEname())).forEach((x,y)->{System.out.println(x+" "+ y);});

		
		
	
	}

}
