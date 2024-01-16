package SerializationDeserializationExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class tester{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			User u=new User(1, "vikas","pwd","other");
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(u);
			oos.flush();
			oos.close();
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
			Object obj=ois.readObject();
			ois.close();
			if(obj instanceof User) {
				User deserializedUser=(User)obj;
				System.out.println(deserializedUser);
			}
			
				
	}
}
