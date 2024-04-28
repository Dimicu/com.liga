package com.repo_git.sinensia.master_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Liga {
	
	
	public void agregarEquipo(Connection connect, Equipo equipo) throws SQLException {

		String query = "INSERT INTO equipos ( nombre, posicion, goles) VALUES (?,?,?)";

		PreparedStatement pstmt = connect.prepareStatement(query);

		pstmt.setString(1, equipo.getNombre());
		pstmt.setInt(2, equipo.getPosicion());
		pstmt.setInt(3, equipo.getPuntos());

		pstmt.execute();
	}

	/**
	 * Inserta una fila con la informacion de cada jugador mediante consulta
	 * preparada.
	 * 
	 * @param connect
	 * @param jugador
	 * @throws SQLException
	 */

	public void agregarJugador(Connection connect, Jugador jugador) throws SQLException {

		String query = "INSERT INTO jugadores ( nombre, goles) VALUES (?,?,?)";

		PreparedStatement pstmt = connect.prepareStatement(query);

		pstmt.setString(1, jugador.getNombre());
		pstmt.setInt(2, jugador.getGoles());
		pstmt.setString(3, jugador.getEquipo().toString());

		
		pstmt.execute();
	}
}
