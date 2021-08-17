package JavaConceptExamples.immutable;

import java.util.Date;

public final class EmployeeImmutableClass {
	private final String EmpName;
	private final int empAge;
	private final Date dob;
	
	
	public EmployeeImmutableClass(String empName, int empAge, Date dob) {
		EmpName = empName;
		this.empAge = empAge;
		this.dob = new Date(dob.getTime());
	}
	
	public Date getDob() {
		return new Date(dob.getTime()) ;
	}
	public int getEmpAge() {
		return empAge;
	}
	public String getEmpName() {
		return EmpName;
	}

	@Override
	public String toString() {
		return "EmployeeImmutableClass [EmpName=" + EmpName + ", empAge=" + empAge + ", dob=" + dob + "]";
	}
	
	
}
