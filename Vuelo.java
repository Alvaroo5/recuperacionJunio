package ej3;

public class Vuelo {
	protected Avion avion;
	protected String fecha;
	protected String aeropuertoOrigen;
	protected String aeropuertoDestino;
	protected Pasajeros[] pasajeros;
	
	public Vuelo(Avion avion, String fecha, String aeropuertoOrigen, String aeropuertoDestino, Pasajeros[] pasajeros) {
		this.avion = avion;
		this.fecha = fecha;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
		this.pasajeros = pasajeros;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public Pasajeros[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajeros[] pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public void addPassenger(Pasajeros pasajero) {
		if() {
			System.out.println("Error, el pasajero ya pertenece al vuelo");
		}
	}
}
