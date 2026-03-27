package com.oneTomany.seventhhibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Course c1 = new Course("JAVA");
       Course c2 = new Course("SQL");
       Course c3 = new Course("Data Structure");
       KodnestStudent ks1 = new KodnestStudent("omkar","om@gmail.cp",326);
       c1.setKs(ks1);
       c2.setKs(ks1);
       c3.setKs(ks1);
       List <Course> courseList = new ArrayList<Course>();
       courseList.add(c1);
       courseList.add(c2);
       courseList.add(c3); 
       
       ks1.setCourses(courseList);
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       session.persist(ks1);
       transaction.commit();
       session.close();
       factory.close();
       
       
       
       
    }
}
