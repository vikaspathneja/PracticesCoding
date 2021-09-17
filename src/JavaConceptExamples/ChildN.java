package JavaConceptExamples;


public class ChildN extends ParentN {

	public void getProp(){
		System.out.println(parentprop);
	}
	
	public static void main(String[] args) {
		ChildN cn=new ChildN();
		cn.parentprop="vvv";
		new ChildN().getProp();;
		}
}
