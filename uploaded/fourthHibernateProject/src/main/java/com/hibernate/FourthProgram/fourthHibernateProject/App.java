package com.hibernate.FourthProgram.fourthHibernateProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		System.out.println("enter the id to update");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		student obj = session.get(student.class, id);

		if (obj != null) {
			System.out.println("enter name and email to uupdate");
			String name = sc.next();
			String email = sc.next();
			obj.setName(name);
			obj.setEmail(email);
			System.out.println("Updated succesfully");
		} else {
			System.out.println("the student with id " + id + " not found in database");
		}

		transaction.commit();

		session.close();
		factory.close();
		sc.close();

	}
}
