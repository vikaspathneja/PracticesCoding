package pojos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Employee {
	private String name;
	private int salary;
	private int id;
	private String grade;
	private String department;
	private String gender;
	private int age;
	private List<Subject>subjects;

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(String name, int salary, String grade, String department) {
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

	public Employee(String name, int salary, String grade, String department, String gender, int age) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.department = department;
		this.gender = gender;
		this.age = age;
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
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				", id=" + id +
				", grade='" + grade + '\'' +
				", department='" + department + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				'}';
	}

	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
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

	@Override
	public boolean equals(Object o) {
		Employee employee = (Employee) o;
		return id == employee.id;
	}

	@Override
	public int hashCode() {
		return 2;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public static List<Employee> getEmployees(){
		return Arrays.asList(
				new Employee("Vikas", 10, "A","IT","M",30),
				new Employee("Sham", 40, "C","IT","M",20),
				new Employee("Ganesh", 100, "Z","IT","F",19),
				new Employee("Ram", 20, "B","FINANCE","M",45),
				new Employee("Lalit", 500, "B","FINANCE","F",50),
				new Employee("Mohit", 30, "A","OPS","M",11),
				new Employee("Saini", 60, "C","OPS","F",60)
				);
	}

}
