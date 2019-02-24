package com.everis.formacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
	public static void main(String[] args) {
		List <String> cosas=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuantos objetos quieres meter?");
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Introduce otro objeto");
			String objetoMeter=sc.next();
			cosas.add(objetoMeter);
		}
		System.out.println(cosas);
	}
}
