package ej2;

public class Pasajeros {
	protected String nombre;
	protected String direccion;
	protected int numPasaporte;
	public enum ESTADO{EMBARCADO, PENDIENTE};
	public ESTADO estado;
	protected static int contadorPasajeros = 0;
	
	public Pasajeros(String nombre, String direccion, int numPasaporte, ESTADO estado) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numPasaporte = numPasaporte;
		this.estado = estado;
		contadorPasajeros++;
	}
	
	public static void embarcar() {
		System.out.println("El pasajero esta embarcando");
	}
	
	public static void sonreir() {
		System.out.println("El pasajero esta sonriendo");
	}
	
	public static void andar() {
		System.out.println("El pasajero esta andando");
	}
	
	public static int getContadorPasajeros() {
        return contadorPasajeros;
    }

	@Override
	public String toString() {
		return "Pasajeros [nombre=" + nombre + ", direccion=" + direccion + ", numPasaporte=" + numPasaporte
				+ ", estado=" + estado + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNumPasaporte(int numPasaporte) {
		this.numPasaporte = numPasaporte;
	}

	public void setEstado(ESTADO estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPasaporte() {
		return numPasaporte;
	}
	
	
}
