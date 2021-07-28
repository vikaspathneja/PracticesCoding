package JavaConceptExamples;

public class Employee {
	private String ename;
	private int salary;
	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String ename) {
		super();
		this.ename = ename;
	}

	public Employee(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	
	

	
}
