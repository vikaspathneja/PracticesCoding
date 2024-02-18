package java_8_features.streams;

import java.util.Comparator;
import java.util.stream.Collectors;

import pojos.Employee;

public class Max_Salary_In_Department {
	public static void main(String[] args) {
//		Map<Object, List<Employee>> s = Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println("s=" + s);
//		System.out.println();
//
//		Map<Object, Optional<Employee>> s1 = Employee.getEmployees().stream()
//				.collect(
//						Collectors.groupingBy(
//								Employee::getDepartment,
//								Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingInt(Employee::getSalary)))
//						)
//				);
//		System.out.println("s1=" + s1);
//		System.out.println();
//		Map<Object, Optional<Employee>> s2 = Employee.getEmployees().stream()
//				.collect(
//						Collectors.groupingBy(
//								Employee::getDepartment,
//								Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
//						)
//				);
//		System.out.println("s2=" + s2);
//

		Employee.getEmployees().stream().collect
				(Collectors.groupingBy(Employee::getDepartment))
				.forEach((key, value) -> System.out.println("key:"+key+" value:"+value.stream().max(Comparator.comparingInt(Employee::getSalary)).get()));
	}
}