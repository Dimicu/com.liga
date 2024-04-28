package com.repo_git.sinensia.master_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	protected static String url = "jdbc:mysql://localhost:3306/liga";
	protected static String user = "root";
	protected static String pass = "root";

	public static Connection generarConexion() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion establecida");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;

	}
}
