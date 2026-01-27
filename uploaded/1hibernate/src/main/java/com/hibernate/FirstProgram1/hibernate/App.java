package com.hibernate.FirstProgram1.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter name , marks and email of student");
       student s1 = new student(sc.next(),sc.nextInt(),sc.next());
//       7 steps of hibernate
//       step-1 : Load the configuration
       
       Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
       
//       Step-2 : create session factory
       SessionFactory factory = configuration.buildSessionFactory();

//     Step-3 : open session
       Session session = factory.openSession();
//     Step-4 : being transaction
       Transaction transaction = session.beginTransaction();
       
//     Step-5 : perform operation 
       session.persist(s1);
//     Step-6 : commit transaction
       transaction.commit();
//     Step-7 : close session and factory
       session.close();
       factory.close();
       
    }
    }

