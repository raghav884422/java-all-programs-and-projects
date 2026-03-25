package com.hibernate.SecondtProgram.secondProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration configuration = new Configuration();
      configuration.configure("hibernate.cfg.xml");
      
      SessionFactory factory =configuration.buildSessionFactory();
      
      Session session = factory.openSession();
      
      Transaction transaction = session.beginTransaction();
      
     student ref= session.get(student.class, 1);
      System.out.println(ref);
      transaction.commit();
      
      session.close();
      factory.close();
      
    }
}
