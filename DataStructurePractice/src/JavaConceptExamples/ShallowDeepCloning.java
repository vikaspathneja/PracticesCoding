package JavaConceptExamples;

public class ShallowDeepCloning implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr=new Address(125121, "Barwala");
		Student s1=new Student("vikas",1,addr);
		Student s2=new Student(s1.getSname(), s1.getSno(),s1.getAddr());
		addr.setPin(125001);
//		s2.setAddr(new Address(1, "New"));
//		s2.setSname("aaaaaaaa");
//		System.out.println("s1="+s1);
//		System.out.println("s2="+s2);
//		System.out.println(s1==s2);
		
		
		String s4=new String("vikasp");
		String s6="p";
		String s5=new String("vikasp");
		String s7="vikasp";
		
			
		System.out.println(s4==s7);
		System.out.println(s4.equals(s7));
//		System.out.println(s1.getClass().getPackage());
		
	}

}
