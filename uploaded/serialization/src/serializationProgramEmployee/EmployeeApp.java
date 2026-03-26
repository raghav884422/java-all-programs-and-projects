package serializationProgramEmployee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeApp {
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee("Raghav", 1234, 90000);
         System.out.println(emp.getName()+" "+ emp.getId()+" "+emp.getSalary());
         String path = "D:\\inputOutputStream\\Employee.txt";
         FileOutputStream fos = new FileOutputStream(path);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(emp);
         
	}
}
