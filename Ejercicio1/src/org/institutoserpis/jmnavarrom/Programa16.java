/*
 * -. Pasar de grados centígrados a grados kelvin. El proceso de leer grados
 * centígrados se debe repetir mientras que se responda ‘S’ a la pregunta:
 * Repetir proceso? (S/N)
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		boolean repetir = false;
		Scanner scanner = new Scanner(System.in);

		do {
			double temperatura;
			String respuesta;
			
			System.out.print("Introduzca la temperatura (Celsius): ");
			temperatura = scanner.nextDouble();
			scanner.nextLine();
			temperatura = temperatura + 273.15;
			System.out.printf("La temperatura introducida en Kelvin es %.2f.%n",
					temperatura);

			System.out.print("¿Repetir proceso? (S/N): ");
			respuesta = scanner.nextLine();
			
			switch (respuesta) {
				case "S":
					repetir = true;
					break;
				default:
					repetir = false;
					break;
			}
			
		} while (repetir);
		
		scanner.close();
	}

}
