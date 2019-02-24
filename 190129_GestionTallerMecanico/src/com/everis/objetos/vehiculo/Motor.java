package com.everis.objetos.vehiculo;

import java.util.Scanner;

public class Motor {
	private float cv;
	private int cc;
	private String marca;
	private int consumo;
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param cv
	 * @param cc
	 * @param marca
	 * @param consumo
	 */
	public Motor(float cv, int cc, String marca, int consumo) {
		super();
		this.cv = cv;
		this.cc = cc;
		this.marca = marca;
		this.consumo = consumo;
	}
	/**
	 * @return the cv
	 */
	public float getCv() {
		return cv;
	}
	/**
	 * @param cv the cv to set
	 */
	public void setCv(float cv) {
		this.cv = cv;
	}
	/**
	 * @return the cc
	 */
	public int getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(int cc) {
		this.cc = cc;
	}
	/**
	 * @return the marca
	 */
	public String getmarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setmarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}
	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	} 
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", cc=" + cc + ", marca=" + marca + ", consumo=" + consumo + "]";
	}
	public void scanner(Scanner sc) {
		System.out.println("CV :");
		setCv(sc.nextFloat());
		System.out.println("CC :");
		setCc(sc.nextInt());
		System.out.println("Marca :");
		setmarca(sc.next());
		System.out.println("Consumo :");
		setConsumo(sc.nextInt());
	}
}
