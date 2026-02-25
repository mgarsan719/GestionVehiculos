package gestionVehiculos.vehiculo.coche;

public class Ranchera extends Coche {

	// ATRIBUTOS
	private double capacidadMaletero;
	
	//CONSTRUCTOR
	public Ranchera(String marca, String modelo, String matricula, String combustible, double capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero = capacidadMaletero;
	}
		
	//GETTERS Y SETTERS
	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Ranchera [marca= %s, modelo= %s, matricula= %s, combustible= %s, capacidadMaletero= %.2f]", super.getMarca(), super.getModelo(), super.getMatricula(), super.getCombustible(), this.capacidadMaletero);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ranchera other = (Ranchera) obj;
		return super.equals(obj) && this.capacidadMaletero == other.capacidadMaletero;
	}
	
	@Override
	public void acelerar() {
		
		System.out.println("La Ranchera acelera así: ¡Vroom, vroom!");
		
	}



}