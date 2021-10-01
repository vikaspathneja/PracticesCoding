package JavaConceptExamples;

import java.util.List;

import java_8_features.streams.Subject;

public class Employee {
	private String ename;
	private int salary;
	private List<Subject>list;
	private int eno;
	private String gender;
	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public List<Subject> getList() {
		return list;
	}

	public void setList(List<Subject> list) {
		this.list = list;
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

	public Employee(String ename, int salary, List<Subject> list) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.list = list;
	}

	public Employee(String ename, int salary, int eno) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.eno = eno;
	}

	public Employee(String ename, int salary, int eno, String gender) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.eno = eno;
		this.gender = gender;
	}
	
	
	
	
	
	

	
}
