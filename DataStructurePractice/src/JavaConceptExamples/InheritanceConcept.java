package JavaConceptExamples;

class Parent {
	public Parent() {
		System.out.println("Parent constr called");
		// TODO Auto-generated constructor stub
	}

	void fun(Parent p) {
		System.out.println("parent fun");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child constr called");
	}

	void fun(Child d) {
		System.out.println("child fun");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.fun(p);

		Child c = new Child();
		c.fun(new Child());
		
		
//		below line is giving Compile Time Error 
		Child c1=(Child) new Parent();
		c1.fun(c);
//		Child c=new Child();
//		Parent p2=new Child();
//		c.fun(c);

	}

}
