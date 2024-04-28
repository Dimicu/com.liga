package com.repo_git.sinensia.master_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EquipoCrud implements CrudBd<Equipo> {

	static String sqlCreate = "INSERT INTO equipos (nombre_equipo,posicion,puntos,victorias,empates,derrotas,goles_favor,goles_contra)"
			+ " VALUES (?,?,?,?,?,?,?,?)";
	static String sqlRead = "Select * from equipos";
	static String sqlUpdate = "UPDATE equipos SET posicion=?,puntos=?,victorias=?,empates=?,derrotas=?,goles_favor=?,goles_contra=? WHERE nombre_equipo = ? ";
	static String sqlDelete = "DELETE FROM equipos WHERE nombre_equipo = ?";

	@Override
	public void create(Equipo equipo) {
		try (Connection connect = DriverManager.getConnection(url, user, pass);

				PreparedStatement pstmt = connect.prepareStatement(sqlCreate))

		{

			pstmt.setString(1, equipo.getNombre());
			pstmt.setInt(2, equipo.getPosicion());
			pstmt.setInt(3, equipo.getPuntos());
			pstmt.setInt(4, equipo.getVictorias());
			pstmt.setInt(5, equipo.getEmpates());
			pstmt.setInt(6, equipo.getDerrotas());
			pstmt.setInt(7, equipo.getGolesFavor());
			pstmt.setInt(8, equipo.getGolesContra());

			pstmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void read() {
		try (Connection connect = DriverManager.getConnection(url, user, pass);
				Statement stmt = connect.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRead)) {

			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("--");
				System.out.print(rs.getString(2));
				System.out.print("--");
				System.out.print(rs.getString(3));
				System.out.print("--");
				System.out.print(rs.getString(4));
				System.out.print("--");
				System.out.print(rs.getString(5));
				System.out.print("--");
				System.out.print(rs.getString(6));
				System.out.print("--");
				System.out.print(rs.getString(7));
				System.out.print("--");
				System.out.print(rs.getString(8));
				System.out.print("--");
				System.out.print(rs.getString(8));
				System.out.println("");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void update(int id, String nombre, int... args) {

		try (Connection connect = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = connect.prepareStatement(sqlUpdate)) {

			for (int i = 0; i < args.length; i++) {
				pstmt.setInt(i + 1, args[i]);
			}
			pstmt.setString(8, nombre);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(String nombre) {
		try (Connection connect = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = connect.prepareStatement(sqlDelete)) {

			pstmt.setString(1, nombre);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

}
