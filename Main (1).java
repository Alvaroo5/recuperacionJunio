package ej2;

import ej2.Avion.MODELOVUELO;
import ej2.Pasajeros.ESTADO;

public class Main {
	public static void main(String[] arg) {
		Avion avion1 = new Avion("Aero1", 10.1, "Model1", MODELOVUELO.CRUCERO);
		Avion avion2 = new Avion("Aero2", 10.2, "Model2", MODELOVUELO.MANUAL);
		Avion avion3 = new Avion("Aero3", 10.3, "Model3", MODELOVUELO.MANUAL);
		Avion avion4 = new Avion("Aero4", 10.4, "Model4", MODELOVUELO.MANUAL);
		Avion avion5 = new Avion("Aero5", 10.5, "Model5", MODELOVUELO.MANUAL);
		
		Pasajeros pas1 = new Pasajeros("Nom1","Dir1", 1, ESTADO.EMBARCADO);
		Pasajeros pas2 = new Pasajeros("Nom2","Dir2", 2, ESTADO.PENDIENTE);
		Pasajeros pas3 = new Pasajeros("Nom3","Dir3", 3, ESTADO.EMBARCADO);
		Pasajeros pas4 = new Pasajeros("Nom4","Dir4", 4, ESTADO.PENDIENTE);
		Pasajeros pas5 = new Pasajeros("Nom5","Dir5", 5, ESTADO.EMBARCADO);
		Pasajeros pas6 = new Pasajeros("Nom6","Dir6", 6, ESTADO.EMBARCADO);
		Pasajeros pas7 = new Pasajeros("Nom7","Dir7", 7, ESTADO.PENDIENTE);
		Pasajeros pas8 = new Pasajeros("Nom8","Dir8", 8, ESTADO.EMBARCADO);
		Pasajeros pas9 = new Pasajeros("Nom9","Dir9", 9, ESTADO.PENDIENTE);
		Pasajeros pas10 = new Pasajeros("Nom10","Dir10", 10, ESTADO.EMBARCADO);

		 System.out.println("Aviones creados: " + Avion.getContadorAviones());
		 System.out.println("Pasajeros creados: " + Pasajeros.getContadorPasajeros());
		
	}
}
