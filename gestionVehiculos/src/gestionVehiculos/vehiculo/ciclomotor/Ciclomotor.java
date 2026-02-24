package gestionVehiculos.vehiculo.ciclomotor;

import gestionVehiculos.vehiculo.Vehiculo;

public abstract class Ciclomotor extends Vehiculo {

	//ATRIBUTOS
	private double cilindrada;
	
	//CONSTRUCTOR
	public Ciclomotor(String marca, String modelo, String matricula, double cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}
	
	//GETTERS Y SETTERS
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Ciclomotor [marca= %s, modelo= %s, matricula= %s, cilindrada= %.2f]", super.getMarca(), super.getModelo(), super.getMatricula(), this.cilindrada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciclomotor other = (Ciclomotor) obj;
		return super.equals(obj) && this.cilindrada == other.cilindrada;
	}
	
}
