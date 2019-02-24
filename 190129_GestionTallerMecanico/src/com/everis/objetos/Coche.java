package com.everis.objetos;

import com.everis.objetos.vehiculo.Motor;
import com.everis.objetos.vehiculo.Rueda;
import com.everis.objetos.vehiculo.Volante;

public class Coche extends Vehiculo{

	private String tipoCoche;
	
	public Coche(Rueda rueda, Volante volante,Motor motor,String tipoCoche) {
		super(rueda, volante, motor);
		this.tipoCoche = tipoCoche;
	}

	public String getTipoCoche() {
		return tipoCoche;
	}

	public void setTipoCoche(String tipoCoche) {
		this.tipoCoche = tipoCoche;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Coche [tipoCoche=" + tipoCoche + "]\n"
				+getRueda().toString()+"\n"
				+getVolante().toString()+"\n"
				+getMotor().toString();
	}
	
	
}
