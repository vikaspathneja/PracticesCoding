package java_8_features.streams;

import java.util.List;
import java.util.stream.Collectors;

import pojos.Employee;

public class reduceExample {
	public static void main(String[] args) {
		Integer sumOfSalaries=Employee.getEmployees().stream().reduce(0,(pr,emp)->pr+emp.getSalary(),Integer::sum);
		System.out.println("sumOfSalaries of from employess stream:"+sumOfSalaries);
		List<Integer>listOfSalaries=Employee.getEmployees().stream().map(x->x.getSalary()).collect(Collectors.toList());
		Integer sum=listOfSalaries.stream().reduce(0,Integer::sum);
		System.out.println("sum of salaries from salaries list only :"+sum);
	}
}
