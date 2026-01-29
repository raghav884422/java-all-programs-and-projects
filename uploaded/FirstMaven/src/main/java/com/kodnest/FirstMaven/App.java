package com.kodnest.FirstMaven;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManagement em = new EmployeeManagement();
		while (true) {

			System.out.println("Choose the operation");
			System.out.println("1-> getemployeebyid ");
			System.out.println("2-> getAllemployee ");
			System.out.println("3-> AddEmployee ");
			System.out.println("4-> updateEmployee ");
			System.out.println("5-> DeleteEmployee ");
			System.out.println("other->EXIT");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("enter the id ");
				int id = sc.nextInt();
				em.getEmployeeById(id);
				break;

			}
			case 2: {

				em.getAllEmployee();
				break;

			}
			case 3: {
				System.out.println("Enter id,name,salary,email,type");
				int id = sc.nextInt();
				String name = sc.next();
				int salary = sc.nextInt();
				String email = sc.next();
				String type = sc.next();
				em.addEmployee(id, name, salary, email, type);
				break;
			}
			case 4: {
				System.out.println("Enter the employeeID to update");
				int id = sc.nextInt();
				em.update(id);
				break;

			}
			case 5: {
				System.out.println("Enter the employeeID to update");
				int id = sc.nextInt();
				em.deleteEmployee(id);
				break;
			}
			default:
				System.out.println("thankyou for using");
				return;
			}
		}

	}
}
