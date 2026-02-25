package gestionVehiculos.vehiculo.furgoneta;

public class Camper extends Furgoneta {
	// ATRIBUTOS
    private String descripcion;

    // CONSTRUCTOR
    public Camper(String marca, String modelo, String matricula, String tipo, String descripcion) {
        super(marca, modelo, matricula, tipo);
        this.descripcion = descripcion;
    }

    // GETTERS Y SETTERS
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void acelerar() {
        System.out.println("La Camper acelera así: ¡rrrum-rrrum!");
    }

	@Override
	public String toString() {
	    return String.format("Camper [marca= %s, modelo= %s, matricula= %s, tipo= %s, descripcion= %s]",super.getMarca(), super.getModelo(), super.getMatricula(), super.getTipo(), this.descripcion);
	}
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        
        Camper other = (Camper) obj;
        return super.equals(obj) && this.descripcion.equals(other.descripcion);
    }
}
