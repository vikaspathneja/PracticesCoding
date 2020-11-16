package JavaConceptExamples;

import java.util.Comparator;

public class Student implements Cloneable,Comparable<Student>{
	private String sname;
	private int sno;
	private Address addr;
//	private final int num;
	public Student() {
		System.out.println("student constr called");
	}
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	
	
	
//	@Override
//	public int hashCode() {
//		int hashCode=sno+sname.length();
//		System.out.println("hashCode=="+hashCode);
//		return hashCode;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu=(Student)obj;
		return this.sname.equalsIgnoreCase(stu.sname) && this.sno== stu.sno;
	}
	
	public Student(String sname, int sno) {
//		super();
		this.sname = sname;
		this.sno = sno;
	}
	
	
	public Student(String sname, int sno,Address addr) {
//		super();
		this.sname = sname;
		this.sno = sno;
//		below line is a way of shallow copy
		this.addr=addr;

//		below line is a way of deep copy via copy constructor
//		this.addr=new Address(addr.getPin(), addr.getStreet());
		
		
		
	}
	
	

	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("setSname=="+this.sname);
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", addr=" + addr + "]";
	}
	
	@Override
	public Object clone() {
	    Student stu = null;
	    try {
	        stu = (Student) super.clone();
	    } catch (CloneNotSupportedException e) {
	        stu = new Student(this.getSname(),this.getSno());
	    }
	    stu.addr= (Address) this.addr.clone();
	    return stu;
	}
	
	
	public int compareTo(Student o) {
		return sno>o.sno?1:sno<o.sno?-1:0;
//		return -sname.compareTo(o.sname);
	}
	

}
