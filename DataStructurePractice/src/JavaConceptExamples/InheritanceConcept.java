package JavaConceptExamples;

class Parent {
	private int x=10;
	public Parent() {
		System.out.println("Parent constr called");
		// TODO Auto-generated constructor stub
	}

//	void fun(Parent p) {
//		System.out.println("parent fun");
//	}
	void fun() {
		System.out.println("fun of parent called");
	}
	
	public int getX(){
		return this.x;
	}
	
}

class Child extends Parent {
	int x=20;
	public Child() {
		System.out.println("Child constr called");
	}

//	void fun(Child d) {
//		System.out.println("child fun");
//	}
	public void fun() {
		System.out.println("fun of child called==");
	}
	public void perimeter() {
		System.out.println("perimeter of child fun called");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.fun(p);

//		Child c = new Child();
//		c.fun(new Child());

		
//		Scenario 1 while Parent Refernce and Parent Object
		System.out.println("Scenario 1 while Parent Refernce and Parent Object");
		Parent prpo=new Parent();
		prpo.fun();//parent fun method called
//		prpo.perimeter();  //method perimeter() is undefined. Compilation Error
		System.out.println("x value=="+prpo.getX()); //give value of Parent x 
System.out.println();
		
//		Scenario 2 while Parent Refernce and Child Object
		System.out.println("Scenario 2 while Parent Refernce and Child Object");
		Parent prco=new Child();
		prco.fun();//Child fun method called if fun method is present in child class
//		prco.perimeter();  //method perimeter() is undefined. Compilation Error
		System.out.println("x value=="+prco.getX()); //give value of Parent x 
		System.out.println();

//		exception in above scenario if reference is of parent and object is of child
//		then we can typecast to child ref and called child class method
		Child nc=(Child)prco;
		nc.perimeter();
		
		
		
		
		
//		Scenario 3 while Child Refernce and Child Object
		System.out.println("Scenario 3 while Child Refernce and Child Object");
		Child crco=new Child();
		crco.fun();//Child fun method called if fun method is present in child class
		crco.perimeter();  //method perimeter() is called 
		System.out.println("x value=="+crco.x); //give value of Child x 
		System.out.println("x value via getX method which is not present in child=="+crco.getX()); //give value of Parent x 
		
		System.out.println();
//		Scenario 4 while Child Refernce and Parent Object		
		System.out.println("Scenario 4 while Child Refernce and Parent Object");
//		Child crpo=(Child)new Parent();//Type mismatch (TypeCasting Issue) 
//		, compilation issue can be resolved by TypeCast With Child Object\
//		but give runtime Error  ClassCastException  java.lang.ClassCastException
		
		
		
		
		
		
		
//		below line is giving Compile Time Error 
//		Child c1=(Child) new Parent();
//		c1.fun(c);
//		Child c=new Child();
//		Parent p2=new Child();
//		c.fun(c);

	}

}
