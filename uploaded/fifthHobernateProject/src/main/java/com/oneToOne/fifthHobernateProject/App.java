package com.oneToOne.fifthHobernateProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter name, email,phone No. of student");
       kodnestStudent ks = new kodnestStudent(sc.next(), sc.next(), sc.nextInt());
       System.out.println("Enter the street, city, state,zipcode of student");
       address ad = new address(sc.next(),sc.next() , sc.next(), sc.nextInt());
       ks.setAddress(ad);
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       session.persist(ks);
       transaction.commit();
       session.close();
       factory.close();
       sc.close();
    
    
    }
}
