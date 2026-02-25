package gestionVehiculos.vehiculo.coche;

import gestionVehiculos.vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo {
	
	// ATRIBUTO COMO ENUM
	private TipoCombustible combustible;
	
	//CONSTRUCTOR
	public Coche(String marca, String modelo, String matricula, String combustible) {
		super(marca, modelo, matricula);
		this.setCombustible(combustible);
	}
		
	//GETTERS Y SETTERS
	public String getCombustible() {
		return combustible.toString();
	}

	public void setCombustible(String combustible) {
		this.combustible = TipoCombustible.valueOf(combustible);
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Coche [marca= %s, modelo= %s, matricula= %s, combustible= %s]", super.getMarca(), super.getModelo(), super.getMatricula(), this.combustible.toString());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return super.equals(obj) && this.combustible.equals(other.combustible);
	}

	
}