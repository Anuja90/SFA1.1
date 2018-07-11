package com.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CategoryManager {

	public static void createCategory(Category category) {

		Configuration configuration = new Configuration().configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		session.save(category);

		transaction.commit();
	}

	public static ArrayList<Person> showEmployee() {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String hql = "from Person";

		Query query = session.createQuery(hql);
		ArrayList<Person> list = (ArrayList<Person>) query.list();

		return list;

	}

}
