package java_8_features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import JavaConceptExamples.Employee;
import JavaConceptExamples.Student;

public class GetHighestPaidFemaleEmployee {
	public static Predicate<Employee>isEmployeeIsGirl=x->x.getGender().equalsIgnoreCase("F");
	public static Comparator<Employee> compareEmployeeBySalary=(x,y)->{
		return Integer.compare(x.getSalary(), y.getSalary());
				};
	public static void main(String[] args) {
		List<Employee>emplList=new ArrayList<>();
		emplList.add(new Employee("a", 10000, 0, "M"));
		emplList.add(new Employee("b", 20000, 0, "F"));
		emplList.add(new Employee("c", 30000, 0, "M"));
		emplList.add(new Employee("d", 40000, 0, "F"));
		emplList.add(new Employee("e", 50000, 0, "M"));
		emplList.add(new Employee("f", 20000, 0, "F"));
		emplList.add(new Employee("g", 30000, 0, "M"));
		emplList.add(new Employee("h", 10000, 0, "F"));
		emplList.add(new Employee("i", 80000, 0, "M"));
		emplList.add(new Employee("j", 90000, 0, "F"));
		emplList.add(new Employee("k", 100000, 0, "M"));
		emplList.add(new Employee("l", 11110000, 0, "F"));
		
		
		Employee eee=emplList.stream().filter(isEmployeeIsGirl).max(compareEmployeeBySalary).get();	
		System.out.println(eee);
		
		
		
	}
}
