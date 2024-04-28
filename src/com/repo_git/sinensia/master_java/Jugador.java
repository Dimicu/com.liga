package com.repo_git.sinensia.master_java;

public class Jugador {

	private String nombre;
	private int goles;
	private Equipo equipo;

	protected Jugador(String nombre, int goles, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.goles = goles;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
