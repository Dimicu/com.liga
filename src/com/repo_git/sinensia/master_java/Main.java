package com.repo_git.sinensia.master_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		Equipo equipo = new Equipo("Madrid", 0, 0, 0, 0, 0, 0, 0);
		equipo.insertarEquipoDb();

		EquipoCrud equipoCrud = new EquipoCrud();

		equipoCrud.update(82, "Madrid", 0, 0, 0, 0, 0, 0, 0);

		//equipoCrud.delete("Madrid");
		equipoCrud.read();

		/**
		 * Queda listo el metodo para insertar en la base de datos dentro de equipo,
		 * llama al metodo del padre para meter en base de datos, me parece mas claro
		 * que cada vez que se crre un equipo meterlo ya en la base de datos Demomento
		 * asi. Asi los puedo crear en un Hashet ordenarlos y luego insertarlos todos
		 * juntos en la base de datos con un for
		 * 
		 */
	}

	/**
	 * try (Connection connect = DriverManager.getConnection(url, user, pass);
	 * 
	 * PreparedStatement pstmt = connect.prepareStatement(sqlUpdate))
	 * 
	 * {
	 * 
	 * 
	 * 
	 * for (int i = 0; i < args.length; i++) { pstmt.setInt(i + 1, args[i]); }
	 * pstmt.setInt(8, id);
	 * 
	 * pstmt.executeUpdate();
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }
	 */
}
