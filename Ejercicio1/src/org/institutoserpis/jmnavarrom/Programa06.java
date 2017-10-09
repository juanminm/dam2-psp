/*
 * -. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
 * teclado.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float velocidad;
		
		System.out.print("Introduzca la velocidad (km/h): ");
		velocidad = scanner.nextFloat();
		velocidad = velocidad * 1000 / 3600;
		
		System.out.printf("El equivalente en m/s es: %.2f%n", velocidad);
		
		
		scanner.close();
	}

}
