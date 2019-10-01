package com.javaegitimleri.petclinic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.service.PetClinicService;
import com.javaegitimleri.petclinic.service.PetClinicServiceFactoryBean;

public class SpringTests {
	
	@Test
	public void testDataSource() throws SQLException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/appcontext/beans-*.xml");
		applicationContext.registerShutdownHook();
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		
		Connection connection = dataSource.getConnection();
		
		boolean closed = connection.isClosed();
		
		Assert.assertFalse(closed);
		
		connection.close();
		
		Assert.assertTrue(connection.isClosed());
	}
	
	@Test
	public void testFindOwners() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/appcontext/beans-*.xml");
		applicationContext.registerShutdownHook();
		
		System.out.println("appcontext ready to use...");
		
		PetClinicService petClinicService = applicationContext.getBean(
				"petClinicService", PetClinicService.class);
		
		List<Owner> owners = petClinicService.findOwners();
		
		owners.forEach(System.out::println);
		
		PetClinicService petClinicService2 = applicationContext.getBean(
				"petClinicService", PetClinicService.class);
		
		System.out.println(petClinicService == petClinicService2);
		
//		PetClinicServiceFactoryBean petClinicServiceFactoryBean = (PetClinicServiceFactoryBean) 
//				applicationContext.getBean("&petClinicService");
	}
}
