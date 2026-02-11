package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsortMathod {
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(11, "Rajiv", 98000);
	Employee e2 = new Employee(12, "shyam", 66000);
	Employee e3 = new Employee(13, "mohan", 74000);
	Employee e4 = new Employee(14, "Sohan", 82000);
	Employee e5 = new Employee(15, "mukund", 57000);
	ArrayList<Employee> al = new ArrayList<Employee>();
	   al.add(e1);
	   al.add(e2);
	   al.add(e3);
	   al.add(e4);
	   al.add(e5);
	   Collections.sort(al,(new compareSalary()));
	   System.out.println(al);
	
}
}
