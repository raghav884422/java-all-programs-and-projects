package selectiveSreialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedStudent {
public static void main(String[] args) {
	
	try {
	String path = "D:\\inputOutputStream\\Student.txt";
	 FileInputStream fis = new FileInputStream(path);
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 Student stu =(Student) ois.readObject();
	 System.out.println(stu);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 }
}
