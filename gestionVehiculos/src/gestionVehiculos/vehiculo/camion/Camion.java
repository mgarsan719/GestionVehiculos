package gestionVehiculos.vehiculo.camion;

import gestionVehiculos.vehiculo.Vehiculo;

public class Camion extends Vehiculo {

	// ATRIBUTOS
	private int capacidadCarga;

	// CONTRUCTOR
	public Camion(String marca, String modelo, String matricula, int capacidadCarga) {
		super(marca, modelo, matricula);
		this.capacidadCarga = capacidadCarga;
	}

	// GETETERS Y SETTERS
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	// METODOS
	@Override
	public String toString() {
		return String.format("Camion [marca= %s, modelo= %s, matricula= %s, capacidadCarga= %d]", super.getMarca(),
				super.getModelo(), super.getMatricula(), this.capacidadCarga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camion other = (Camion) obj;
		return super.equals(obj) && this.capacidadCarga == other.capacidadCarga;
	}

	@Override
	public void acelerar() {
		System.out.println("El camión acelera así: brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrommmmmmm");
	}

	public void descargarContainer() {
		System.out.println("El container del camión se está descargando...");
	}

}
