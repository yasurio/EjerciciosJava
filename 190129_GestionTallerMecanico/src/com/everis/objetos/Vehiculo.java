package com.everis.objetos;

import com.everis.objetos.vehiculo.Motor;
import com.everis.objetos.vehiculo.Rueda;
import com.everis.objetos.vehiculo.Volante;

public class Vehiculo {
	private Motor motor;
	private Rueda rueda;
	private Volante volante;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(Rueda rueda, Volante volante, Motor motor) {
		super();
		this.rueda = rueda;
		this.volante = volante;
		this.motor = motor;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Rueda getRueda() {
		return rueda;
	}
	public void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}
	public Volante getVolante() {
		return volante;
	}
	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [motor=" + motor + ", rueda=" + rueda + ", volante=" + volante + "]";
	}
	
	
}
