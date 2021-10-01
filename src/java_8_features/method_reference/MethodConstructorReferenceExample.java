package java_8_features.method_reference;

import java.util.function.Predicate;

import JavaConceptExamples.Employee;
import JavaConceptExamples.Student;

class RunnableMethodRef{
	public static void run() {
		for(int i=0; i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class PredicateMethodRef{
	public  boolean test(String s) {
		if(s!=null && s.length()>0)
			return true;
		else
			return false;
	}
}


interface MyEmployeeInterface<T> {
	public T get();
}
public class MethodConstructorReferenceExample {
	public static void main(String[] args) {
//		Runnable r=;
		Thread t=new Thread(RunnableMethodRef::run);
		t.start();
		for(int i=0; i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		PredicateMethodRef pmr=new PredicateMethodRef();
		Predicate<String>p=pmr::test;
		boolean value=p.test(null);
		System.out.println(value);
		
		
		MyEmployeeInterface<Employee> e=Employee::new;
		Employee emp=e.get();
		System.out.println(emp);
	
		MyEmployeeInterface<Student> mei=Student::new;
		Student sss=mei.get();
		System.out.println(sss);
	}
	
	
}
