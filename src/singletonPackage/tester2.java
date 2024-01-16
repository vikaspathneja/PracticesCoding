package singletonPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class tester2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		CustomEnum ss1=CustomEnum.instance;
		CustomEnum ss2=CustomEnum.instance;
		SingletonObj s1=ss1.getObj();
		SingletonObj s2=ss2.getObj();
		s1.setObjintvalue(10);
		s2.setObjintvalue(20);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("single.txt"));
		out.writeObject(ss1);
		ObjectInput oi =new ObjectInputStream(new FileInputStream("single.txt"));
		CustomEnum ss1DeserilizedVersionObject=(CustomEnum)oi.readObject();
		System.out.println("ss1DeserilizedVersionObject:"+ss1DeserilizedVersionObject.hashCode());
		System.out.println("ss1:"+ss1.hashCode());
		
		
		
	}
}
