package ej1;

import ej1.Avion.MODELOVUELO;
import ej1.Pasajeros.ESTADO;

public class Main {

	public static void main(String[] arg) {
		Avion avion1 = new Avion("Aero1", 10.1, "Model1", MODELOVUELO.CRUCERO);
		Avion avion2 = new Avion("Aero2", 10.2, "Model2", MODELOVUELO.MANUAL);
		
		Pasajeros pas1 = new Pasajeros("Nom1","Dir1", 1, ESTADO.EMBARCADO);
		Pasajeros pas2 = new Pasajeros("Nom2","Dir2", 2, ESTADO.PENDIENTE);
		Pasajeros pas3 = new Pasajeros("Nom3","Dir3", 3, ESTADO.EMBARCADO);
		Pasajeros pas4 = new Pasajeros("Nom4","Dir4", 4, ESTADO.PENDIENTE);
		Pasajeros pas5 = new Pasajeros("Nom5","Dir5", 5, ESTADO.EMBARCADO);
		
		avion1.despegar();
		avion1.volar();
		avion2.aterrizar();
		
		System.out.println();
		pas1.embarcar();
		pas2.sonreir();
		pas3.andar();
		
		System.out.println();
		System.out.println("El modelo de la primera avion es: "+avion1.getModelo());
		System.out.println("El nombre del primer pasajero es: "+pas1.getNombre());
		System.out.println("El numero de pasaporte del tercer pasajero es: "+pas3.getNumPasaporte());
		
		System.out.println();
		System.out.println(avion1.toString());
		System.out.println(pas1.toString());
	}
}
