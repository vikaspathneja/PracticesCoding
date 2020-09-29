package JavaConceptExamples;

public class MainClass {

	public static void main(String[] args) {
		Address addr = new Address(1, "aas");
		CustomObjectIntoImmutableObject obj1 = new CustomObjectIntoImmutableObject("Vikas", addr);
		CustomObjectIntoImmutableObject obj2 = new CustomObjectIntoImmutableObject("Vikas", addr);
		addr.setPin(122);
//		System.out.println(obj2.getAddr());
//		System.out.println(obj2.getObjectName());
		
		
		Character x=127;
		Character y=125;
		System.out.println(x==y);
		
		int i=100;
		ma(i);
		
	}
	
	public static void ma(long l){
		System.out.println("Widening");
	}
	
	
}
