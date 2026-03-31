package com.HQLQuerey.tenthHibernareProgramHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction =session.beginTransaction();
  
       String hQL = "FROM student WHERE marks>75";
      Query<student> query= session.createQuery(hQL,student.class);
      List<student> student = query.getResultList();
      System.out.println(student);
//      for(student x:student) {
//    	  System.out.println("student name: " +x.getId());
//    	  System.out.println("student name: " +x.getMarks());
//      }
       transaction.commit();
       session.close();
       factory.close();
    }
}
