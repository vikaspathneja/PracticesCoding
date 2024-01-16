package java_8_features.cust_consumer;

import java.util.function.BiConsumer;

import JavaConceptExamples.Employee;

public class BiConsumerExample {
	public static BiConsumer<Employee, Integer> getAppraisalPercentage=(x,y)->{
		System.out.println("getAppraisal consumer called:"+(x.getSalary()*y)/100);
	};
	public static BiConsumer<Employee, Integer> salaryDecrement=(x,y)->{
		x.setSalary(x.getSalary()-((x.getSalary()*y)/100));
		System.out.println("salary decrement consumer called and final salary is :"+x.getSalary());
	};
	
	public static void main(String[] args) {
		System.out.println("Vikas after appraisal salary:");
		Employee ee=new Employee("vikas", 1000);
		BiConsumer<Employee,Integer> bi=getAppraisalPercentage.andThen(salaryDecrement);
//		getAppraisalPercentage.accept(ee, 2);
		bi.accept(ee, 2);
		System.out.println(ee);
	}
}
