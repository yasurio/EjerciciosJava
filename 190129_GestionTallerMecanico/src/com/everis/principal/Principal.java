package com.everis.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.everis.execeptions.OwnExceptions;
import com.everis.objetos.Bicicleta;
import com.everis.objetos.Cliente;
import com.everis.objetos.Coche;
import com.everis.objetos.Moto;
import com.everis.objetos.Vehiculo;
import com.everis.objetos.vehiculo.Motor;
import com.everis.objetos.vehiculo.Rueda;
import com.everis.objetos.vehiculo.Volante;

public class Principal {
	private static List<Vehiculo> vehiculoList;
	private static List<Cliente> clientesList;
	private static Scanner sc;
	
	public static void main(String[] args) throws OwnExceptions {
		if(StringUtils.isBlank("    ")) {
			
		}
		int opc=-1;
		vehiculoList = new ArrayList<>();
		clientesList =new ArrayList<>();
		sc=new Scanner(System.in);
		do {
			System.out.println("///////////////////");
			System.out.println("1.-Añadir Coche");
			System.out.println("2.-Añadir Moto");
			System.out.println("3.-Añadir Bicicleta");
			System.out.println("4.-Mostrar Coche");
			System.out.println("5.-Mostrar Moto");
			System.out.println("6.-Mostrar Bicicleta");
			System.out.println("7.-Eliminar Vehiculo ");
			System.out.println("8.-Modificar Vehiculo ");
			System.out.println("9.-Añadir usuario");
			System.out.println("10.-Modificar usuario");
			System.out.println("11.-Eliminar usuario");
			System.out.println("0.-Salir");
			System.out.println("///////////////////");
			opc=sc.nextInt();
			Vehiculo vh = null;
			switch (opc) {
			case 1:
				System.out.println("Introduce el nombre del Coche");
				String nombreCoche=sc.next();
				System.out.println("Introduce los datos de la rueda del coche:");
				Rueda rdCoche=new Rueda();
				rdCoche.scanner(sc);
				
				System.out.println("Introduce los datos de los volantes del coche: ");
				Volante vlCoche=new Volante();
				vlCoche.scanner(sc);
				
				System.out.println("Introduce los datos del moto del coche: ");
				Motor mtCoche=new Motor();
				mtCoche.scanner(sc);
				
				vh=new Coche(rdCoche, vlCoche, mtCoche, nombreCoche);
				break;
			case 2:

				System.out.println("Introduce el nombre de la moto");
				String nombreMoto=sc.next();
				
				System.out.println("Introduce los datos de la rueda de la moto:");
				Rueda rdMoto=new Rueda();
				rdMoto.scanner(sc);
				
				System.out.println("Introduce los datos de los volantes de la moto: ");
				Volante vlMoto=new Volante();
				vlMoto.scanner(sc);
				
				System.out.println("Introduce los datos del moto de la moto: ");
				Motor mtMoto=new Motor();
				mtMoto.scanner(sc);
				
				vh=new Moto(rdMoto, vlMoto, mtMoto, nombreMoto);
				break;
				
			case 3:

				System.out.println("Introduce el nombre de la bicicleta");
				String nombreBicicleta=sc.next();
				System.out.println("Introduce los datos de la rueda de la bicicleta:");
				Rueda rdBicicleta=new Rueda();
				rdBicicleta.scanner(sc);
				
				System.out.println("Introduce los datos de los volantes de la bicicleta: ");
				Volante vlBicicleta=new Volante();
				vlBicicleta.scanner(sc);
				
				System.out.println("Introduce los datos del moto de la bicicleta: ");
				Motor mtBicicleta=new Motor();
				mtBicicleta.scanner(sc);
				
				vh=new Bicicleta(rdBicicleta, vlBicicleta, mtBicicleta, nombreBicicleta);
				break;
			case 4:
				for (Vehiculo vehiculo : vehiculoList) {
					if(vehiculo instanceof Coche) {
						System.out.println(((Coche)vehiculo).toString());
					}
				}
				break;
			case 5:
				for (Vehiculo vehiculo : vehiculoList) {
					if(vehiculo instanceof Moto) {
						System.out.println(((Moto)vehiculo).toString());
					}
				}
				break;
			case 6:
				for (Vehiculo vehiculo : vehiculoList) {
					if(vehiculo instanceof Bicicleta) {
						System.out.println(((Bicicleta)vehiculo).toString());
					}
				}
				break;
			case 7:
				System.out.println("Introduce el nombre del vehiculo que quieras eliminar:");
				String borrar=sc.next();
				boolean band=true;
				int sice=vehiculoList.size();
				for (int i=0;i<sice&& band;i++) {
					Vehiculo v= vehiculoList.get(i);
					
					if(v instanceof Coche) {
						if(((Coche)v).getTipoCoche().equals(borrar)) {
							vehiculoList.remove(v);
							sice--;
						}
					}

					if(v instanceof Bicicleta) {
						if(((Bicicleta)v).getTipoBicicleta().equals(borrar)) {
							vehiculoList.remove(v);
							sice--;
						}
					}

					if(v instanceof Moto) {
						if(((Moto)v).getTipoMoto().equals(borrar)) {
							vehiculoList.remove(v);
							sice--;
						}
					}
				}
				
				break;
			case 8:
				break;
			case 9:
				System.out.println("Introduce los datos del cliente :");
				Cliente cl=new Cliente();
				cl.scanner(sc);
				clientesList.add(cl);
				break;
			case 10:
				System.out.println("Introduce el dni del usuario a modificar:");
				String dniModi=sc.next();
				for (Cliente cliente : clientesList) {
					if(dniModi.equalsIgnoreCase(cliente.getDni())) {
						cliente.modUsuario(sc);
					}
				}
				break;
			case 11:
				System.out.println("Introduce el dni del usuario a borrar");
				String dniRemove=sc.next();
				clientesList.removeIf(dni -> dni.getDni().equalsIgnoreCase(dniRemove));
				break;
			default:
				System.out.println("No has introducido la opcion correcta vuelvelo a intentar");
				break;
			}
			if(vh!=null) {
				vehiculoList.add(vh);
			}
			System.out.println("///////////////////");
			for (Vehiculo vehiculo : vehiculoList) {
				System.out.println(vehiculo.toString());
				System.out.println("-------------------");
			}
			for (Cliente cliente : clientesList) {
				System.out.println(cliente.toString());
				System.out.println("********************");
			}
		}while(opc!=0);
	
		sc.close();
	
	}

}
