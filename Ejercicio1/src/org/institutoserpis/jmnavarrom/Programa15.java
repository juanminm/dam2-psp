/*
 *  -. Intercambiar el contenido de dos variables
 */
package org.institutoserpis.jmnavarrom;

public class Programa15 {

	public static void main(String[] args) {
		String animal = "Gato";
		String vehiculo = "Coche";
		String aux;
		
		System.out.println("El valor de 'animal' es: " + animal);
		System.out.println("El valor de 'vehiculo' es: " + vehiculo);

		System.out.println("Intercambiando...");
		aux = vehiculo;
		vehiculo = animal;
		animal = aux;
		System.out.println();
		
		System.out.println("El valor de 'animal' es: " + animal);
		System.out.println("El valor de 'vehiculo' es: " + vehiculo);
	}
}
