package gestionVehiculos.vehiculo.ciclomotor;

public class Quad extends Ciclomotor {

	// ATRIBUTOS
	private double tamanyo;

	// CONSTRUCTOR
	public Quad(String marca, String modelo, String matricula, double cilindrada, double tamanyo) {
		super(marca, modelo, matricula, cilindrada);
		this.tamanyo = tamanyo;
	}

	// GETTERS Y SETTERS
	public double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}

	// METODOS
	@Override
	public String toString() {
		return String.format("Quad [marca= %s, modelo= %s, matricula= %s, cilindrada= %.2f, tamaño= %.2f]",
				super.getMarca(), super.getModelo(), super.getMatricula(), super.getCilindrada(), this.tamanyo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quad other = (Quad) obj;
		return super.equals(obj) && this.tamanyo == other.tamanyo;
	}

	@Override
	public void acelerar() {

		System.out.println("El quad acelera así: brum brum bruuuuummmm brum");

	}

}
