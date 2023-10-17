package br.com.gulliver_traveller.dao;
import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.driver.OracleDriver;

public class DataSource {
	private Connection connection;
	
	private String url;
	private String hostname;
	private String username;
	private String password;
	private String database;
	private int port;
	
	public DataSource() {
		try {
			
			DriverManager.registerDriver(new OracleDriver());
			
			hostname="//127.0.0.1";
			port = 1521;
			username = "SYS as SYSDBA";
			password = "123456";
			database = "xe";
			url = "jdbc:oracle:thin:@" + hostname + ":" + port + "/" + database;
			
			connection = DriverManager.getConnection(url, username, password);
			
			if (connection == null) {
				System.out.println("Erro ao conectar com o DB");
			}
			else {
				System.out.println("Conexão feita com suceso");
			}
		}
		catch(Exception ex) {
			System.out.println("Falha na ocnexão com o BD: " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}
