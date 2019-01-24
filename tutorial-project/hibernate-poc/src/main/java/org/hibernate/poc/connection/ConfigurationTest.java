package org.hibernate.poc.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigurationTest {
	public static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate-cfg.xml");
			return cfg.buildSessionFactory();
		}catch (Exception e) {
			System.out.println("Exception in configuration:: "+e);
		}
		return null;
	}
	public static void main(String[] args) {
		buildSessionFactory();
	}
}
