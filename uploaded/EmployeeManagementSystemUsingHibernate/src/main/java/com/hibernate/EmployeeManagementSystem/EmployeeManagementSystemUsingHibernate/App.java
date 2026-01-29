package com.hibernate.EmployeeManagementSystem.EmployeeManagementSystemUsingHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {

	static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to employee management system: ");
		while (true) {
			System.out.println("PRESS => 1 AddEmployee");
			System.out.println("PRESS => 2 GetEmployee");
			System.out.println("PRESS => 3 DeleteEmployee");
			System.out.println("PRESS => 4 UpdateEmployee");
			System.out.println("other =>  EXIT");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				AddEmployee();
				break;
			case 2:
				getEmployee();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				UpdateEmployee();
				break;
			default:
				System.out.println("Thankyou for using Employee management system");
				return;
			}
		}

	}

	public static void AddEmployee() {
	Session session =factory.openSession();
	Transaction transaction = session.beginTransaction();
	System.out.println("Enter name, salary, and email of employee");
	employee emp = new employee(sc.next(),sc.nextInt(),sc.next());
	session.persist(emp);
	transaction.commit();
	session.close();
	}

	public static void getEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter the id of employee to get data ");
		int id = sc.nextInt();
+
		employee obj =session.get(employee.class, id);  
		if(obj!=null) {
			System.out.println(obj);
		}else {
			System.out.println("Employee id "+id+"dose not exist pleases try again");
		}
		transaction.commit();
		session.close();

	}

	public static void deleteEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter the id of employee to det data ");
		int id = sc.nextInt();

		employee obj =session.get(employee.class, id);  
		if(obj!=null) {
			session.remove(obj);
			System.out.println("Employee id "+id+" deleted sucessfully");
		}else {
			System.out.println("Employee id "+id+"dose not exist pleases try again");
		}
		transaction.commit();
		session.close();

	}

	public static void UpdateEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter the id of employee: ");
		int id = sc.nextInt();

		employee obj =session.get(employee.class, id);  
		if(obj!=null) {
			System.out.println("Enter name salary,email of employee");
               obj.setName(sc.next());
               obj.setSalary(sc.nextInt());
               obj.setEmail(sc.next());
               session.persist(obj);
               System.out.println("updated sucessfully");
		}else {
			System.out.println("Employee id "+id+"dose not exist pleases try again");
		}
		transaction.commit();
		session.close();
	}

}
