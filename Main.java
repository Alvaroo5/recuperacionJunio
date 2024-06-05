package ej53;

import java.util.HashSet;
import java.util.Set;

import ej53.Avion.MODELOVUELO;
import ej53.Pasajeros.ESTADO;

public class Main {
	public static void main(String[] arg) {
		Avion av1 = new Avion("Aerolinea1", 17.5, "Model1", MODELOVUELO.PILOTO_AUTOMATICO);
		Avion av2 = new Avion("Aerolinea2", 18.5, "Model2", MODELOVUELO.PILOTO_AUTOMATICO);
		
		Pasajeros pas1 = new Pasajeros("Pasajero1", "Direccion1", 1, ESTADO.EMBARCADO);
		Pasajeros pas2 = new Pasajeros("Pasajero2", "Direccion2", 2, ESTADO.PENDIENTE);
		Pasajeros pas3 = new Pasajeros("Pasajero3", "Direccion3", 3, ESTADO.EMBARCADO);
		Pasajeros pas4 = new Pasajeros("Pasajero4", "Direccion4", 4, ESTADO.PENDIENTE);
		Pasajeros pas5 = new Pasajeros("Pasajero5", "Direccion5", 5, ESTADO.EMBARCADO);
		
        
        Vuelo vuelo1 = new Vuelo(av1, "fecha1", "Sevilla", "Varsovia");
		Vuelo vuelo2 = new Vuelo(av2, "fecha2", "Sevilla", "Dublin");
		
		vuelo1.addPassenger(pas1);
		vuelo1.addPassenger(pas2);
		vuelo1.addPassenger(pas3);
		vuelo1.addPassenger(pas4);
		vuelo1.addPassenger(pas5);
		
		vuelo2.addPassenger(pas1);
		vuelo2.addPassenger(pas2);
		vuelo2.addPassenger(pas3);
		vuelo2.addPassenger(pas4);
		vuelo2.addPassenger(pas5);
		
		System.out.println("Lista de Pasajeros del Vuelo 1:");
        vuelo1.listPassenger();

        System.out.println("\nLista de Pasajeros del Vuelo 2:");
        vuelo2.listPassenger();

        vuelo1.delPassenger(1);

        System.out.println("\nLista de Pasajeros del Vuelo 1 después de eliminar un pasajero:");
        vuelo1.listPassenger();
	}
}
