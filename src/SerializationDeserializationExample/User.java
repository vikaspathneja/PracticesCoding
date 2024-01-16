package SerializationDeserializationExample;

import java.io.Serializable;

public class User  implements Serializable{
	private int uid;
	private String name;
	final transient String password;
//	when use transient with final and assign value there only then value store in class constant pool and it will always being avaialbe
//	final transient String password="pwd";

//	when use new keyword and created a string object then when deserialization will put default value of object and no impat of final keyword here
//	final transient String password=new String("pwd");
	
	
//	when assigned value in constructor with value passed in parameter in that case when deserialization not happened and due to transient value also not stored so null value will be assigned  
//	final transient String password;
	static String other;
	
	public static String getOther() {
		return other;
	}
	public static void setOther(String other) {
		User.other = other;
	}
	public String getPassword() {
		return password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name +" other="+other+ " , password=" + password + "]";
	}
	public User(int uid, String name,String password,String other) {
		super();
		this.uid = uid;
		this.name = name;
		this.password=password;
		this.other=other;
	}
	
	
}
