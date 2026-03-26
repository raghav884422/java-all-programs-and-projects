package serializationProgramEmployee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class employeeDeserialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
     String path = "D:\\inputOutputStream\\Employee.txt";
     FileInputStream fis = new FileInputStream(path);
     ObjectInputStream ois = new ObjectInputStream(fis);
    Employee emp = (Employee) ois.readObject();
    System.out.println(emp.name+" "+emp.id+" "+emp.salary);
	}
}
