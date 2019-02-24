package com.everis.formacion;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.print("Escribe su nota: ");
		Float num=sc.nextFloat();
		Calificacion cf=new Calificacion();
		System.out.println("Has sacado un "+num+" estas "+cf.nota(num));
		sc.close();
	}

}
