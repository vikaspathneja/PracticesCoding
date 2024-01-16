package java_8_features;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import pojos.Employee;

public class HighestSalaryinEachDepartment {
	public static void main(String[] args) {		
			Map<Object, List<Employee>> s=Employee.getEmployees().stream().collect(Collectors.groupingBy(x->x.getDepartment()));
			System.out.println("s="+s);
			System.out.println();
			
			Map<Object, Optional<Employee>> s1=Employee.getEmployees().stream()
					.collect(
							Collectors.groupingBy(
									x->x.getDepartment(),
									Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingInt(x->x.getSalary())))
									)
							);
			System.out.println("s1="+s1);
			System.out.println();
			Map<Object, Optional<Employee>> s2=Employee.getEmployees().stream()
					.collect(
							Collectors.groupingBy(
									x->x.getDepartment(),
									Collectors.maxBy(Comparator.comparingInt(x->x.getSalary()))
									)
							);
			System.out.println("s2="+s2);
	}
}
