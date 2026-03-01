package gestionVehiculos;

import java.util.ArrayList;
import java.util.List;

import gestionVehiculos.vehiculo.Vehiculo;

public class Concesionario {

	// ATRIBUTOS
	private String nombre;
	private List<Vehiculo> listaVehiculos;

	// CONSTRUCTOR
	public Concesionario(String nombre) {
		this.nombre = nombre;
		this.listaVehiculos = new ArrayList<>();
	}

	// GETERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	// METODOS
	public void añadirVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
		System.out.println("Vehículo añadido: " + vehiculo);
	}

	public boolean eliminarVehiculo(Vehiculo vehiculo) {

		if (listaVehiculos.remove(vehiculo)) {
			System.out.println("Vehículo eliminado: " + vehiculo);
			return true;
		}

		else {
			System.out.println("El vehículo no existe en el inventario.");
			return false;
		}
	}
}
