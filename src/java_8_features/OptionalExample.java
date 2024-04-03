package java_8_features;

import pojos.Employee;
import pojos.Subject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalExample {
	public static void main(String[] args) {
//		Optional<String>opt=Optional.ofNullable(null);
//		System.out.println(opt.orElse("vikas"));
//		Optional<String>opt2=Optional.ofNullable("ram");
//		System.out.println(opt2.orElse("vikas"));
//		System.out.println(opt.isPresent());
//		System.out.println(opt2.isPresent());
//		Optional<Employee> optional=Optional.ofNullable(new Employee("vikas",1000,"A"));
//		optional.map(Employee::getSalary).filter(x->x>1).ifPresent(System.out::println);
//		long sumOfAllEmployees=Employee.getEmployees().stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
//		System.out.println(sumOfAllEmployees);
//		Map<String, Integer> maxSalaryEmployees=
//				Employee.getEmployees().stream().flatMap(x->x.getSubjects().stream()).count()
//						.collect
//								(Collectors.groupingBy(Collectors.partitioningBy()));
//		System.out.println(maxSalaryEmployees);

		Map<String,Integer>eachdepartmentSalarySum=Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)));
		System.out.println("eachdepartmentSalarySum:"+eachdepartmentSalarySum);

		Map<String, List<Integer>> eachDepartmentMaxSalary=Employee.getEmployees().stream()
				.collect(Collectors
						.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getSalary,Collectors.toList())));
		System.out.println("eachDepartmentMaxSalary:"+eachDepartmentMaxSalary);

		Map<String,Long>countOfEachDepartment=Employee.getEmployees().stream()
				.filter(employee -> employee.getAge()>=20)
				.collect(Collectors
						.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("countOfEachDepartment:"+countOfEachDepartment);

		Map<String,Double>avgEachDepartment=Employee.getEmployees().stream()
				.collect(Collectors
						.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));
		System.out.println("avgEachDepartment:"+avgEachDepartment);
		Map<Integer,Employee>emp=Employee.getEmployees().stream().peek(em-> em.setId(new Random().nextInt(1000))).collect(Collectors.toMap(Employee::getId,Function.identity()));

		List<Subject>subjects=Employee.getEmployees().stream().
				filter(emp1->emp1.getSubjects()!=null)
				.flatMap(x->x.getSubjects().stream().distinct()).collect(Collectors.toList());
		System.out.println(subjects);

		Map<String,Optional<Employee>>maxSalaryEmp=Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
		Map<String,Optional<Employee>>minSalaryEmp=Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingInt(Employee::getSalary))));
		System.out.println(maxSalaryEmp);
		System.out.println(minSalaryEmp);
		System.out.println("-------------------------------");
		Map<String,List<Employee>>mapOfMinMaxEmployee= Stream.of(maxSalaryEmp,minSalaryEmp)
				.flatMap(map->map.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, entry->{
					List<Employee> l=new ArrayList<>();
					l.add(entry.getValue().get());
					return l;
				},(list1, list2)-> {
					list1.addAll(list2);
					return list1;
				}));

		System.out.println("---------------------");
		List<String>list=Employee.getEmployees().stream()
				.filter(employee->!employee.getName().startsWith("A"))
				.map(employee -> employee.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(list);

		System.out.println("------------------------");
		int minValueOfSalary=Employee.getEmployees().stream().mapToInt(Employee::getSalary).min().getAsInt();
		System.out.println(minValueOfSalary);

		List<Integer> values = Arrays.asList(1,2,3,4);
		Integer length=values.stream().reduce(0,Integer::sum);
		System.out.println(length);




	}


}
