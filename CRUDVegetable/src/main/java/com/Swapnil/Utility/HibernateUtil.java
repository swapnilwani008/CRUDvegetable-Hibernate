//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.Swapnil.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Swapnil.Entity.Vegetable;

public class HibernateUtil {

	static SessionFactory factory = null;
	static {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vegetable.class);
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static Session getSession() {
		return factory.openSession();
	}
}