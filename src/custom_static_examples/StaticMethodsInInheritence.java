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
		
		/**
		 * as static method belongs to class level , Employee ref is being used to 
		 * invoke static methods so employee class static method getOtherDetails 
		 * will be invoked 
		 */
		 Employee empl=new ManangerEmp();
		 empl.getOtherDetails();

		 
		 /**
		  * Here ManangerEmp  class ref is used to invoke static method
		  * so ManangerEmp class static method will be invoked
		  */
		 ManangerEmp empl2=new ManangerEmp();
		 empl2.getOtherDetails();

		 /**
		  * ManangerEmp empl3=null; 
		  * even though above ref is ref to null, still it will be able to invoke
		  * static method of ManangerEmp class ,as at the class loading time
		  * static methods will be loaded as well 
		  */
		 ManangerEmp empl3=null;
		 empl3.getOtherDetails();

		 
	 }
}
