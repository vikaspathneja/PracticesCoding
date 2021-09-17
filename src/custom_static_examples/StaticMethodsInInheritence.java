package custom_static_examples;

class Employee{
	protected String ename;
	protected int salary;
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
	
	public static void getOtherDetails(){
		System.out.println("other details static method of employee class");
	}
	
	
}


class ManangerEmp extends Employee{
	public static void getOtherDetails(){
		System.out.println("other details static method of ManagerEmp class");
	}
}

public class StaticMethodsInInheritence {
	 public static void main(String[] args) {
		 Employee empl=new ManangerEmp();
		 empl.getOtherDetails();

		 ManangerEmp empl2=null;
		 empl2.getOtherDetails();

	 }
}
