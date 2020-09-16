package JavaConceptExamples;

public class Student implements Cloneable{
	private String sname;
	private int sno;
	private Address addr;
	
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public int hashCode() {
		int hashCode=sno+sname.length();
		System.out.println("hashCode=="+hashCode);
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu=(Student)obj;
		return this.sname.equalsIgnoreCase(stu.sname) && this.sno== stu.sno;
	}
	
	public Student(String sname, int sno) {
		super();
		this.sname = sname;
		this.sno = sno;
	}
	
	
	public Student(String sname, int sno,Address addr) {
		super();
		this.sname = sname;
		this.sno = sno;
		this.addr=addr;
	}
	
	
	public Student(String sname, int sno,int pincode,String streetaddr) {
		super();
		this.sname = sname;
		this.sno = sno;
		this.addr=new Address(pincode,streetaddr);
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	
//	@Override
//	protected Student clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return (Student)super.clone();
//	}
//	
//	@Override
//	protected Student clone() throws CloneNotSupportedException {
//		Student stu= (Student) super.clone();
//		stu.addr=addr.clone();
//		return stu;
//	}
//	
	

}
