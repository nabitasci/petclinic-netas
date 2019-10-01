package com.javaegitimleri.petclinic.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	@Value("${dataSource.driverClassName}")
	private String driverClassName;
	
	@Value("${dataSource.url}")
	private String url;
	
	@Value("${dataSource.username}")
	private String username;
	
	@Value("${dataSource.password}")
	private String password;
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

}
