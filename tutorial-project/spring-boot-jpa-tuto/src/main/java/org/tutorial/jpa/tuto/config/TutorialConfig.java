package org.tutorial.jpa.tuto.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class TutorialConfig {
	
	private final String PROPERTY_URL="spring.datasource.url";
	private final String PROPERTY_USERNAME="spring.datasource.username";
	private final String PROPERTY_PASSWORD="spring.datasource.password";
	private final String PROPERTY_DRIVER="spring.datasource.driver-class-name";
	private final String PROPERTY_DIALECT="spring.jpa.properties.hibernate.dialect";
	private final String PROPERTY_SHOW_SQL="spring.jpa.show-sql";
	
	@Autowired
	Environment environment;
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		System.out.println("CHECKING: "+environment.getProperty(PROPERTY_URL));
		LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
		lfb.setPackagesToScan("org.tutorial.jpa.tuto.entity");
		lfb.setPersistenceProviderClass(HibernatePersistence.class);
		lfb.setDataSource(DataSource());
		lfb.setJpaProperties(hibernateProps());
		return lfb;
		
	}
	
	@Bean
	DataSource DataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl(environment.getProperty(PROPERTY_URL));
		ds.setUsername(environment.getProperty(PROPERTY_USERNAME));
		ds.setPassword(environment.getProperty(PROPERTY_PASSWORD));
		ds.setDriverClassName(environment.getProperty(PROPERTY_DRIVER));
		return ds;
	}
	@Bean
	Properties hibernateProps() {
		Properties properties = new Properties();
		properties.setProperty(PROPERTY_DIALECT, environment.getProperty(PROPERTY_DIALECT));
		properties.setProperty(PROPERTY_SHOW_SQL, environment.getProperty(PROPERTY_SHOW_SQL));
		//properties.setProperty(PROPERTY_HBM2DDL, environment.getProperty(PROPERTY_HBM2DDL));		
		return properties;
	}
	
	@Bean
	JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

}
