package JavaConceptExamples;

public class ShallowDeepCopy implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * below code is deepy copy via copy constructor refer
		 * Student Constructor for copy constr
		 * this.addr=new Address(addr.getPin(), addr.getStreet());
		 * 
		 */
		
//		Address addr=new Address(125121, "Barwala");
//		Student s1=new Student("vikas",1,addr);
//		Student s2=new Student("student2",2,addr);
//		addr.setStreet("Hisar");
//		System.out.println(s1);
//		System.out.println(s2);
//		
		
		
		/*
		 * 
		 * below is a code of deep copy via cloning refer overridden 
		 * clone method of student & address object
		 */
		Address addr2=new Address(125121, "Barwala");
		Student s3=new Student("vikas",1,addr2);
		Student s4=(Student)s3.clone();
		System.out.println("s3=="+s3);
		System.out.println("s4=="+s4);
		addr2.setStreet("Hisar");
		System.out.println("s3=="+s3);
		System.out.println("s4=="+s4);
		
		
	
	}

}
