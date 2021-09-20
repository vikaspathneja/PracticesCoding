package java_8_features.cust_consumer;

import java.util.function.BiConsumer;

import JavaConceptExamples.Employee;

public class BiConsumerExample {
	public static BiConsumer<Employee, Integer> getAppraisal=(x,y)->{
		System.out.println(x.getSalary()*y);
	};
	
	public static void main(String[] args) {
		System.out.println("Vikas after appraisal salary:");
		getAppraisal.accept(new Employee("vikas", 1000), 2);
	}
}
