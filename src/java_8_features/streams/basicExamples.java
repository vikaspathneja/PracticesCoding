package java_8_features.streams;

import pojos.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class basicExamples {
	public static void main(String[] args) {
		List<Integer> integerList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> courseList=Arrays.asList("spring","AWS","AZURE","GCLOUD","ab","supghfhgfhg");
		//odd no in the list
		integerList.stream().filter(x->x%2!=0).forEach(System.out::println);
		//cube of odd no in the list
		integerList.stream().filter(x->x%2!=0).map(x->x*x*x).forEach(System.out::println);
		//get courses from list having name spring 
		//courseList.stream().filter(x->x.contains("Spring") || x.contains("spring")).forEach(System.out::println);
		//get courses from list having lenght > or equal to  4
		//courseList.stream().filter(x->x.length()>=4).forEach(System.out::println);
		//print no of characters in the course list
		//courseList.forEach(x->System.out.println(x.length()));
		
		//TempStudent
//		Get all student having mobile numbers 1233/1234.
//		List<Student>tempStudentList=TempStudent.getStudents().stream()
//						.filter(x->x.getMobileNumbers().stream().allMatch(z->z.getNumber().equals("1233") || z.getNumber().equals("1234")))
//								.collect(Collectors.toList());
//		System.out.println(tempStudentList);
//
//		List<Employee>genderAgeEmp=Employee
//				.getEmployees().stream()
//				.filter(emp->emp.getAge()>30)
//				.sorted(Comparator.comparing(Employee::getGender))
//				.collect(Collectors.toList());
//		System.out.println(genderAgeEmp);
//		String sss=genderAgeEmp.stream().map(Employee::getName).collect(Collectors.joining("|","$","@"));
//		System.out.println(sss);

		//List<List<String>>listOflist=new ArrayList<>();
		//listOflist.add(Arrays.asList("first","second"));
		//listOflist.add(Arrays.asList("third","fourth"));
		//listOflist.add(Arrays.asList("fifth","sixth"));
		//listOflist.stream().flatMap(Collection::stream).forEach(System.out::println);
		//String[]arr=new String[10];
		//arr[0]="helo";
		//arr[1]="sfd";
		//Stream.of(arr).forEach(System.out::println);

		//employee with max salary in each department
		Map<String,Optional<Employee>>map=Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
		System.out.println(map);
	}
}
