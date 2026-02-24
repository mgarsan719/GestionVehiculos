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
        System.out.println("La camper " + getMarca() + " está acelerando suavemente para no desordenar el interior.");
    }

    @Override
    public String toString() {
        return String.format("Camper [marca= %s, modelo= %s, matricula= %s, tipo= %s, descripcion= %s]", 
                this.getMarca(), this.getModelo(), this.getMatricula(), this.getTipo(), this.descripcion);
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
