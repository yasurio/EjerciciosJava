package com.everis.objetos;

import com.everis.objetos.vehiculo.Motor;
import com.everis.objetos.vehiculo.Rueda;
import com.everis.objetos.vehiculo.Volante;

public class Moto extends Vehiculo{

	private String tipoMoto;
	

	public Moto(Rueda rueda, Volante volante, Motor motor,String tipoMoto) {
		super(rueda,volante, motor);
		this.tipoMoto = tipoMoto;
	}
	
	public Moto(String tipoMoto) {
		super();
		this.tipoMoto = tipoMoto;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Moto [tipoMoto=" + tipoMoto + "]\n"
				+getRueda().toString()+"\n"
				+getVolante().toString()+"\n"
				+getMotor().toString();
	}
	
}
