package gestionVehiculos.vehiculo;

public abstract class Vehiculo {

	//ATRIBUTOS
	private String marca;
	private String modelo;
	private String matricula;
	
	//CONTRUCTOR
	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	
	//GETTERS
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	//SETTERS
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	//METODOS
	@Override
	public String toString() {
		return String.format("Vehiculo [marca= %s, modelo= %s, matricula= %s]", this.marca, this.modelo, this.matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return this.marca.equals(other.marca)
				&& this.modelo.equals(other.modelo)
				&& this.matricula.equals(other.matricula);
	}
	
	public abstract void acelerar();
	
}
