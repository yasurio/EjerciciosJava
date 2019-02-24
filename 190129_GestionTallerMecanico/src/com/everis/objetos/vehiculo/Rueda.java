package com.everis.objetos.vehiculo;

import java.util.Scanner;

public class Rueda {
	private int altura;
	private int anchura;
	private double pulgadas;
	private String marca;
	
	public Rueda() {
		super();
	}
	public Rueda(int altura, int anchura, double pulgadas, String marca) {
		super();
		this.altura = altura;
		this.anchura = anchura;
		this.pulgadas = pulgadas;
		this.marca = marca;
	}
	public int getAltura() {
		return this.altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getAnchura() {
		return this.anchura;
	}
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	public double getPulgadas() {
		return this.pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rueda [altura=" + altura + ", anchura=" + anchura + ", pulgadas=" + pulgadas + ", marca=" + marca + "]";
	}
	public void scanner(Scanner sc) {
		System.out.println("Altura :");
		setAltura(sc.nextInt());
		System.out.println("Anchura:");
		setAnchura(sc.nextInt());
		System.out.println("Pulgadas:");
		setPulgadas(sc.nextDouble());
		System.out.println("Marca: ");
		setMarca(sc.next());
	}
	
}
