package com.oneToOne.SixthHibernateProjectBook;

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
       System.out.println("enter the name ,price, no.ofPages");
       book bok = new book(sc.next(),sc.nextInt(), sc.nextInt());
       System.out.println("Enter the name ,gender ,age ,address of the author");
       author atr = new author(sc.next(), sc.next(), sc.nextInt(), sc.next());
       bok.setAdress(atr);
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session=factory.openSession();
       Transaction transaction = session.beginTransaction();
       session.persist(bok);
       transaction.commit();
       session.close();
       sc.close();
       factory.close();
    }
}
