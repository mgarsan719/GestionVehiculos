package gestionVehiculos.vehiculo.furgoneta;

import gestionVehiculos.vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	// ATRIBUTO COMO ENUM
    private TipoFurgoneta tipo; 

    // CONSTRUCTOR 
    public Furgoneta(String marca, String modelo, String matricula, String tipo) {
        super(marca, modelo, matricula);
        this.setTipo(tipo); 
    }

    // GETTER 
    public String getTipo() {
        return tipo.toString();
    }

    // SETTER 
    public void setTipo(String tipo) {
        this.tipo = TipoFurgoneta.valueOf(tipo);
    }

    // COMPORTAMIENTO ESPECÍFICO
    public void cargarMercancia() {
        System.out.println("Abriendo puertas traseras y cargando mercancía en la furgoneta tipo " + this.tipo.toString());
    }

    @Override
    public void acelerar() {
        System.out.println("La Furgoneta acelera así: ¡prrrummm-prrrumm!");
    }

	@Override
	public String toString() {
	    return String.format("Furgoneta [marca= %s, modelo= %s, matricula= %s, tipo= %s]",super.getMarca(), super.getModelo(), super.getMatricula(), this.tipo.toString());
	}
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        
        Furgoneta other = (Furgoneta) obj;
        return super.equals(obj) && this.tipo.equals(other.tipo);
    }
}
