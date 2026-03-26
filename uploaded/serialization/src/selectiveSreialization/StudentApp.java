package selectiveSreialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentApp {
	public static void main(String[] args) {
		
     Student stu =new Student(1, "Raghav", 22, "male", 99);
     try {
     String path = "D:\\inputOutputStream\\Student.txt";
     FileOutputStream fos = new FileOutputStream(path);
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(stu);
     } catch (Exception e) {
		// TODO: handle exception
    	 e.printStackTrace();
	}
	}
}
