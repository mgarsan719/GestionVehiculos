package gestionVehiculos;

import gestionVehiculos.vehiculo.Vehiculo;
import gestionVehiculos.vehiculo.camion.Camion;
import gestionVehiculos.vehiculo.ciclomotor.Moto;
import gestionVehiculos.vehiculo.ciclomotor.Quad;
import gestionVehiculos.vehiculo.coche.Ranchera;
import gestionVehiculos.vehiculo.coche.Sedan;
import gestionVehiculos.vehiculo.furgoneta.Camper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear concesionario
		Concesionario c1 = new Concesionario("Concesionario 1");

		// Creacion de vehiculos
		Vehiculo camion = new Camion("Volvo", "V234", "1234-ABC", 23);
		Vehiculo moto = new Moto("Volvo", "V234", "5555-ABC", 23, "clasica");
		Vehiculo quad = new Quad("Volvo", "V234", "2222-ABC", 23, 50);
		Vehiculo ranchera = new Ranchera("Volvo", "7777-MMA", "1234-ABC", "diesel", 200);
		Vehiculo sedan = new Sedan("Volvo", "V234", "1111-DDA", "diesel", 5);
		Vehiculo camper = new Camper("Volvo", "V234", "8954-ABC", "L1H1", "Esto es una camper L1H1");

		// Añadir vehiculos
		c1.añadirVehiculo(camion);
		c1.añadirVehiculo(moto);
		c1.añadirVehiculo(quad);
		c1.añadirVehiculo(ranchera);
		c1.añadirVehiculo(sedan);
		c1.añadirVehiculo(camper);

		// Demostracion de seleccion dinamica del metodo acelerar()
		System.out.println("\n--- Demostración de Selección Dinámica (Polimorfismo) ---");
		for (Vehiculo v : c1.getListaVehiculos()) {
			System.out.println("Vehiculo con matricula: " + v.getMatricula());
			v.acelerar();
			System.out.println();
		}

	}

}
