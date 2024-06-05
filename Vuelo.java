package ej53;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vuelo {
	protected Avion avion;
	protected String fecha;
	protected String aeropuertoOrigen;
	protected String aeropuertoDestino;
	Set<Pasajeros> listaPasajeros;
	
	public Vuelo(Avion avion, String fecha, String aeropuertoOrigen, String aeropuertoDestino) {
		this.avion = avion;
		this.fecha = fecha;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
		this.listaPasajeros = new HashSet<Pasajeros>();
	}
	
	public void addPassenger(Pasajeros nuevoPasajero) {
		if (listaPasajeros.contains(nuevoPasajero)) {
			System.out.println("El pasajero ya pertenece al vuelo");
		}else {
			listaPasajeros.add(nuevoPasajero);
		}
	}
	
	public void delPassenger(int numPasaporte) {
		Iterator<Pasajeros> iterator = listaPasajeros.iterator();
	    while(iterator.hasNext()) {
	        Pasajeros pasajero = iterator.next();
	        if(pasajero.getNumPasaporte() == numPasaporte) {
	            iterator.remove();
	            return; // Salir del método después de eliminar el pasajero
	        }
	    }
	    System.out.println("El pasajero no se encuentra en el vuelo");
	}
	
	public void listPassenger() {
		for (Pasajeros pasajero : listaPasajeros) {
			System.out.println(pasajero.toString());
		}
	}
}
