package JavaConceptExamples.immutable;

import java.util.Date;

public class ImmutableTester {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		EmployeeImmutableClass emp=new EmployeeImmutableClass("vikas", 21, new Date());
		System.out.println("before="+emp.toString());
		int value=new Date().getDate()+2;
		System.out.println("value==="+value);
		emp.getDob().setDate(value);
		System.out.println("after="+emp.toString());
		//	
		
	
		
	}
	
	 
	
}
