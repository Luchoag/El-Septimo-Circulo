package org.greppiluciano.septimocirculo.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class Conexion {

	protected Connection con;
	
	private final String driver = "com.mysql.cj.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/septimocirculo?serverTimezone=UTC";
	private final String user = "root";
	private final String pass = "";

	public void conectar() throws Exception {
		try {
			con = DriverManager.getConnection(url, user, pass);
			Class.forName(driver);
			
		} catch (Exception e) {
			System.out.println("No conecta");
			throw e;
		}
	}
	
	public void cerrarConexion() throws SQLException {
		if (con != null) {
			if (!con.isClosed()) {
				con.close();
			}
		}
	}
	
}
