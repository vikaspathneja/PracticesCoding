package singletonPackage;

public class tester2 {
	public static void main(String[] args) {
		CustomEnum ss1=CustomEnum.instance;
		CustomEnum ss2=CustomEnum.instance;
		SingletonObj s1=ss1.getObj();
		SingletonObj s2=ss2.getObj();
		s1.setObjintvalue(10);
		s2.setObjintvalue(20);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
