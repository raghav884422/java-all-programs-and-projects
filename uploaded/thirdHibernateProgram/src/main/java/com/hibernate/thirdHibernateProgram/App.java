package com.hibernate.thirdHibernateProgram;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
//    Step 1 and 2
    	SessionFactory factory  =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//     Step 3
    	Session session = factory.openSession();
//       step 4
    	Transaction transaction = session.beginTransaction();
//    	Step 5
//    	check weather the data is present or not 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the id to delete:");
    	student stud = session.get(student.class, sc.nextInt());
    	if(stud!=null) {
    		session.remove(stud);
    		System.out.println("data deleted successfully");
    	}
    	else {
    		System.out.println("id not found");
    	}
//    	Step 6 close all
    	transaction.commit();
    	session.close();
    	factory.close();
    	
    
    
    }
}
