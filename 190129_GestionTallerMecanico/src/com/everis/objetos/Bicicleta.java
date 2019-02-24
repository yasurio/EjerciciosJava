package com.everis.objetos;

import com.everis.objetos.vehiculo.Motor;
import com.everis.objetos.vehiculo.Rueda;
import com.everis.objetos.vehiculo.Volante;

public class Bicicleta extends Vehiculo{
	
	private String tipoBicicleta;

	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(Rueda rueda, Volante volante,Motor motor,String tipoBicicleta) {
		super(rueda,volante,motor);
		this.tipoBicicleta = tipoBicicleta;
	}

	public String getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bicicleta [tipoBicicleta=" + tipoBicicleta + "]\n"
				+getRueda().toString()+"\n"
				+getVolante().toString()+"\n"
				+getMotor().toString();
	}
	
	
}
