package JavaConceptExamples;

public class StringExample {
public static void main(String[] args) {
	String second=new String("vikas");
	System.out.println("second="+second.hashCode());
	String first="vikas";
	System.out.println("first="+first.hashCode());
	System.out.println(second==first);
	String third=second.intern();
	System.out.println(first==third);
	System.out.println("third="+third.hashCode());
}
}
