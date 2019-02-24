package com.everis.formacion;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.print("Introduce el valor de a : ");
		a=sc.nextInt();
		System.out.print("Introduce el valor de b : ");
		b=sc.nextInt();
		System.out.println("La suma de a + b es : "+(a+b));
		sc.close();
	}
	public int sumar(int a, int b) {
		int c=a+b;
		return c;
		
	}
}
