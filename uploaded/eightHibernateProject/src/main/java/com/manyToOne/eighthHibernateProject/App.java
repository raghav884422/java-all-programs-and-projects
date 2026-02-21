package com.manyToOne.eighthHibernateProject;

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
     Department department = new Department("IT", "5th floor");
     
     Employee employee1 = new Employee("omkar",50000,department);
     Employee employee2 = new Employee("praveen",55000,department);
     Employee employee3 = new Employee("raghav",65000,department);
     
     List<Employee> empList = new ArrayList<Employee>();
     empList.add(employee1);
     empList.add(employee2);
     empList.add(employee3);
     department.setEmployee(empList);
     SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=factory.openSession();
     Transaction transaction = session.beginTransaction();
     session.persist(department);
     
     transaction.commit();
     session.close();
     factory.close();
     
     
     
     
     
    }
}
