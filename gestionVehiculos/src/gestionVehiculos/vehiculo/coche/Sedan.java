package gestionVehiculos.vehiculo.coche;

public class Sedan extends Coche {

	// ATRIBUTOS
	private int puertas;

	// CONSTRUCTOR
	public Sedan(String marca, String modelo, String matricula, String combustible, int puertas) {
		super(marca, modelo, matricula, combustible);
		this.puertas = puertas;
	}

	// GETTERS Y SETTERS
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	// METODOS
	@Override
	public String toString() {
		return String.format("Sedan [marca= %s, modelo= %s, matricula= %s, combustible= %s, puertas= %d]",
				super.getMarca(), super.getModelo(), super.getMatricula(), super.getCombustible(), this.puertas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sedan other = (Sedan) obj;
		return super.equals(obj) && this.puertas == other.puertas;
	}

	@Override
	public void acelerar() {

		System.out.println("El Sedán acelera así: ¡Rrrrmmmm!");

	}

	public void ajustarAsientosTraseros() {

		System.out.println("Los asientos traseros se han ajustado correctamente para que quepan los pasajeros");

	}

}
