package com.everis.formacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		NumeroMes nm=new NumeroMes();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el mes :");
		int a=sc.nextInt();
		System.out.println("El mes introducido es : "+nm.mes(a));
		sc.close();
		
	}

}
;