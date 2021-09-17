package JavaConceptExamples;


public class kkk {
public static void main(String[] args) {
	String s1="Vikas";
	
	/*
	 * when doing below refer assignment , it will copy data of String into s2 
	 * and
	 * if there is any change s1 it will not impact s2
	 */
	String s2=s1;
	s1=new String("Sharma");
	System.out.println(s2);
	System.out.println(s1);
	System.out.println("s1==s2");
	System.out.println(s1==s2);
	
	String s3=new String("Vikas");
	System.out.println("s3==s2");
	System.out.println(s3==s2);
	String s4=s3.intern();
	System.out.println("s4:"+s4);
	System.out.println("s2:"+s2);
	System.out.println("s4==s2");
	System.out.println(s4==s2);
	
	
	
}


}
