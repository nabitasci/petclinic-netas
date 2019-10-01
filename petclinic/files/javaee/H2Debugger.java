package com.javaegitimleri.petclinic.javaee;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.h2.tools.Server;

public class H2Debugger {
	
	private DataSource dataSource;

	
	public H2Debugger(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public void debug() {
		
		Connection connection = obtainConnection();

		try {
			Server.startWebServer(connection);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private Connection obtainConnection() {
		try {
			Connection connection = obtainConnectionFromSpring();
			if(connection == null) {
				connection = dataSource.getConnection();
			}
			return connection;
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	private Connection obtainConnectionFromSpring() {
		try {
			Class<?> clazz = Class.forName("org.springframework.jdbc.datasource.DataSourceUtils");
			return (Connection) clazz.getMethod("getConnection", DataSource.class).invoke(null, dataSource);
		} catch(Exception ex) {
			return null;
		}
	}
}
