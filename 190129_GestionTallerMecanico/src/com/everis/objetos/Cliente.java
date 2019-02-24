package com.everis.objetos;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import com.everis.execeptions.OwnExceptions;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private Calendar fecha_nacimiento;
	
	/**
	 * 
	 */
	public Cliente() {
		super();
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param fecha_nacimiento
	 */
	public Cliente(String dni, String nombre, String apellidos, Calendar fecha_nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}



	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	/**
	 * @return the fecha_nacimiento
	 */
	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public void scanner(Scanner sc) throws OwnExceptions {
		System.out.println("DNI :");
		setDni(sc.next());
		System.out.println("Nombre :");
		setNombre(sc.next());
		System.out.println("Apellidos :");
		setApellidos(sc.next());
		System.out.println("Fecha Nacimiento (DD/MM/AAAAA) :");
		Calendar fecha_naci=Calendar.getInstance();
		String fecha=sc.next();
		String [] fechaList= fecha.split("/");
		try{
			if(fechaList.length!=3)throw new OwnExceptions("hola que tal");
			fecha_naci.set(Integer.parseInt(fechaList[2]), Integer.parseInt(fechaList[1])-1, Integer.parseInt(fechaList[0]));
			setFecha_nacimiento(fecha_naci);
		}
		catch(Exception e){
			
		}
		System.out.println("hola que tal");
		}
	public void modUsuario(Scanner sc) throws OwnExceptions{
		System.out.println("Nombre :");
		setNombre(sc.next());
		System.out.println("Apellidos :");
		setApellidos(sc.next());
		System.out.println("Fecha Nacimiento (DD/MM/AAAAA) :");
		Calendar fecha_naci=Calendar.getInstance();
		String fecha=sc.next();
		String [] fechaList= fecha.split("/");
		if(fechaList.length!=3) {
			throw new OwnExceptions("hola");
		}
		fecha_naci.set(Integer.parseInt(fechaList[2]), Integer.parseInt(fechaList[1])-1, Integer.parseInt(fechaList[0]));
		setFecha_nacimiento(fecha_naci);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String fecha_naci_impr=fecha_nacimiento.get(Calendar.DATE)+" - "+fecha_nacimiento.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+" - "+fecha_nacimiento.get(Calendar.YEAR);
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento= "
				+ fecha_naci_impr + "]";
	}
	
}