package java_8_features.cust_predicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import JavaConceptExamples.Employee;

public class CustomObjectValidation {
	public static void main(String[] args) {
		Predicate<Employee>pe=x->x.getEname().equalsIgnoreCase("vikas");
		Predicate<Employee>salaryGreaterThan10000=x->x.getSalary()>10000;
		
		List<Employee>list=new ArrayList<>();
		list.add(new Employee("rrr", 1));
		list.add(new Employee("aaa", 1));
		list.add(new Employee("bbb", 1));
		list.add(new Employee("ccc", 10100));
		list.add(new Employee("vikas", 222222));
		list.add(new Employee("eee", 1));
		list.add(new Employee("fff", 20100));
		
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if(pe.test(employee))
				System.out.println("valid user==="+employee);
		
		
			if(salaryGreaterThan10000.test(employee))
				System.out.println("employee with salary >10000:"+employee.getEname());
		
		}
		
		
		
		
	}
}
