/*
 * -. Programa Java que lea dos números enteros por teclado y los muestre por
 * pantalla.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		
		System.out.printf("Introduzca un nombre: ");
		nombre = scanner.nextLine();
		
		System.out.println();
		System.out.printf("Buenos dias %s", nombre);
		scanner.close();
	}
}
