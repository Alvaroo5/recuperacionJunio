package ej3;

import ej2.Avion.MODELOVUELO;

public class Avion {
	protected String aerolinea;
	protected double longitud;
	protected String modelo;
	public enum MODELOVUELO{MANUAL, CRUCERO, PILOTO_AUTOMATICO}
	public MODELOVUELO modeloVuelo;
	protected static int contadorAviones = 0;
	
	public Avion(String aerolinea, double longitud, String modelo, MODELOVUELO modeloVuelo) {
		this.aerolinea = aerolinea;
		this.longitud = longitud;
		this.modelo = modelo;
		this.modeloVuelo = modeloVuelo;
		contadorAviones++;
	}
	
	public static void despegar() {
		System.out.println("El avion esta despegando");
	}
	
	public static void aterrizar() {
		System.out.println("El avion esta aterrizando");
	}
	
	public static void volar() {
		System.out.println("El avion se encuentra en pleno vuelo");
	}

	public static int getContadorAviones() {
        return contadorAviones;
    }
	
	@Override
	public String toString() {
		return "Avion [aerolinea=" + aerolinea + ", longitud=" + longitud + ", modelo=" + modelo + ", modeloVuelo="
				+ modeloVuelo + "]";
	}
	
	
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setModeloVuelo(MODELOVUELO modeloVuelo) {
		this.modeloVuelo = modeloVuelo;
	}
	
	
}
