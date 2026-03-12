package com.manyToMany.ninethHibernateProject;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Student s1 = new Student("raghav", "raghavmishera2233@gmai.con");
		Student s2 = new Student("jyoti", "jyoti123@gnmail,c9j");
		Student s3 = new Student("utkarsh", "utkarsh@123.com");
		Club c1 = new Club("collageSport");
		Club c2 = new Club("collageNCC");
		Club c3 = new Club("collagedrama");
		Set<Club> clubSet1 = new HashSet<Club>();
		clubSet1.add(c1);
		clubSet1.add(c2);

		Set<Club> clubSet2 = new HashSet<Club>();
		clubSet2.add(c1);
		clubSet2.add(c2);

		Set<Club> clubSet3 = new HashSet<Club>();
		clubSet3.add(c1);
		clubSet3.add(c2);
		s1.setClub(clubSet1);
		s2.setClub(clubSet2);
		s3.setClub(clubSet3);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		
		transaction.commit();
		session.close();
		factory.close();

	}
}
