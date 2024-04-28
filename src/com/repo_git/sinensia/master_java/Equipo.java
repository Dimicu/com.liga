package com.repo_git.sinensia.master_java;

public class Equipo extends EquipoCrud {

	private String nombre;
	private int posicion;
	private int puntos;
	private int victorias;
	private int empates;
	private int derrotas;
	private int golesFavor;
	private int golesContra;

	public Equipo(String nombre, int posicion, int puntos, int victorias, int empates, int derrotas, int golesFavor,
			int golesContra) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.puntos = puntos;
		this.victorias = victorias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	/**
	 * Inserta en la base de datos a traves del metodo del padre
	 */
	public void insertarEquipoDb() {
		this.create(this);
	}

}
