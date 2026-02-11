
public class problem2 {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;

	class Employee {
	    private String name;
	    private double salary;

	    // Constructor to initialize Employee object
	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getters for the fields
	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Override toString to print Employee details
	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', salary=" + salary + "}";
	    }
	}

	//Implement the SalaryComparator using the Comparator interface
	class SalaryComparator implements Comparator<Employee> {
	    @Override
	    public int compare(Employee e1, Employee e2) {
	        // Compare salaries in ascending order
	        if(e1.getSalary()>e2.getSalary()){
	            return 1;
	        }
	       
	        if(e1<e2){
	            return -1;
	        }
	        else{
	            return 0;
	        }
	       
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Create an ArrayList to store Employee objects
	        int n =sc.nextInt();
	        // TODO: Read the number of employees
	        ArrayList al = new ArrayList();
	        for(int i =1;i<=n;i++){
	            String name=sc.next();
	            int salary =sc.nextInt();
	         al.add(new Employee(name,salary));
	        }
	        // TODO: Add Employee objects to the ArrayList
	        Collections.sort(al,SalaryComparator());
	        System.out.println(al);
	        // TODO: Sort employees by salary using Comparator
	        // TODO: Print the sorted list of employees

	        sc.close();
	    }

		private static Comparator SalaryComparator() {
			// TODO Auto-generated method stub
			return null;
		}
	
}
