package com.everis.formacion;

public class Calificacion {
public String nota(float nota) {
	String txt="";
	if(nota<5) {
		txt="Suspenso";
	}else {
		txt="Aprobado";
	}
	return txt;
}
}
