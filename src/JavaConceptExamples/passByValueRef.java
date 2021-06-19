package JavaConceptExamples;


class Dummy{
	private String dname;
	private int dnumber;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDnumber() {
		return dnumber;
	}
	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}
	@Override
	public String toString() {
		return "Dummy [dname=" + dname + ", dnumber=" + dnumber + "]";
	}

}


public class passByValueRef {

	public static void main(String[] args) throws InterruptedException {
//		Student s=new Student("vikas", 1);
//		System.out.print("hashcode of s ");s.hashCode();
//		passByReference(s);
//		System.out.println(s.toString());
//		System.out.println(s.getSname());
		Dummy dobj=new Dummy();
		dobj.setDname("mohit");
		Dummy ndobj=modifyAttributesOfObjectByReference(dobj);
///		dobj=ndobj;
	}

	private static Dummy modifyAttributesOfObjectByReference(Dummy dobj) {
		Dummy nobj=new Dummy();
		nobj.setDname("vikas");
		dobj=nobj;
		dobj.setDname("vaibhav");
		return dobj;
	}

	private static void passByReference(Student s) {
//		System.out.print("hashcode of s inside method ");s.hashCode();
	Student o=new Student("modifiedstudent",2);
//	System.out.print("hashcode of o inside method ");o.hashCode();
//	s=o;
//	System.out.print("hashcode of s after ref o assigned to s ");s.hashCode();
//	System.out.println("s ref =="+s);
	
	s.setSname("mohit");
	System.out.println(o);
//	System.out.println("s ref =="+s);
	
	
	
	}

}
