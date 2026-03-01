package gestionVehiculos.vehiculo.ciclomotor;

public class Moto extends Ciclomotor {

	// ATRIBUTOS
	private String tipo;

	// CONSTRUCTOR
	public Moto(String marca, String modelo, String matricula, double cilindrada, String tipo) {
		super(marca, modelo, matricula, cilindrada);
		this.tipo = tipo;
	}

	// GETTERS Y SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// METODOS
	@Override
	public String toString() {
		return String.format("Moto [marca= %s, modelo= %s, matricula= %s, cilindrada= %.2f, tipo= %s]",
				super.getMarca(), super.getModelo(), super.getMatricula(), super.getCilindrada(), this.tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		return super.equals(obj) && this.tipo.equals(other.tipo);
	}

	@Override
	public void acelerar() {

		System.out.println("La moto acelera así: brrrrr brrrrr brrrrrrom");

	}

}
