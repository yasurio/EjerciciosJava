package com.everis.formacion;

public class NumeroMes {
	public String mes(int num) {
		String meses []= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		String mesesLeft="";
		for (int i = 0; i < meses.length ; i++) {
			if( i > num-1 && i!=meses.length-1 ){
				mesesLeft=mesesLeft.concat(meses[i]+",");				
			}else if(i > num-1 && i==meses.length-1) {
				mesesLeft=mesesLeft.concat(meses[i]);
			}
		}
		
		return mesesLeft;
	}
}