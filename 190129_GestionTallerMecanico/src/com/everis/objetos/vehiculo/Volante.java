package com.everis.objetos.vehiculo;

import java.util.Scanner;

public class Volante {
	private String marca;
	
	/**
	 * @param marca
	 */
	public Volante(String marca) {
		super();
		this.marca = marca;
	}

	/**
	 * Empty Constructor
	 */
	public Volante() {
		super();
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void scanner(Scanner sc) {
		setMarca(sc.next());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Volante [marca=" + marca + "]";
	}
	
}
