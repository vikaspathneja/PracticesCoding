package pojos;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Employee {
	private String name;
	private int salary;
	private int id;
	private String grade;
	private String department;
	
	
	public Employee(String name, int salary,String grade, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = rand.nextInt();
		this.grade = grade;
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	private static Random rand=new Random();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", grade=" + grade + "]\n";
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.id=rand.nextInt();
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Employee(String name, int salary,String grade) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = rand.nextInt();
		this.grade = grade;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public static List<Employee> getEmployees(){
		return Arrays.asList(
				new Employee("Vikas", 10, "A","IT"),
				new Employee("Sham", 40, "C","IT"),
				new Employee("Ganesh", 100, "Z","IT"),
				new Employee("Ram", 20, "B","FINANCE"),
				new Employee("Lalit", 500, "B","FINANCE"),
				new Employee("Mohit", 30, "A","OPS"),
				new Employee("Saini", 60, "C","OPS")
				);
	}

}
