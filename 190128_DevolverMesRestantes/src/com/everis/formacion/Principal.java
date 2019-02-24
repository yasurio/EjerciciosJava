package com.everis.formacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		NumeroMes nm=new NumeroMes();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce el mes :");
		int a=sc.nextInt();
		if(a<1 || a>12) {
			System.out.print("Error: no existe el mes 0");
		}else {
			System.out.print("Los meses restantes son : "+nm.mes(a));
		}
		sc.close();
		
	}

}
;