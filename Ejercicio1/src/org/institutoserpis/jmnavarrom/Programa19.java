/*
 * -. Leer 10 enteros y mostrar la media de los valores negativos y la de los
 * positivos.
 */
package org.institutoserpis.jmnavarrom;


import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arrayInt = new int[10];
		int sumaPos = 0;
		int contarPos = 0;
		int sumaNeg = 0;
		int contarNeg = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca el " + (i + 1) + "º número entero: ");
			arrayInt[i] = scanner.nextInt();

			if (scanner.hasNextLine()) {
				scanner.nextLine();
			}

		}

		for (int i = 0; i < arrayInt.length; i++) {
			if (arrayInt[i] >= 0) {
				sumaPos += arrayInt[i];
				contarPos++;
			} else {
				sumaNeg += arrayInt[i];
				contarNeg++;
			}
		}

		System.out.printf("La media de los positivos es: %f%nLa media de los"
				+ "negativos es: %f%n", (double) sumaPos / (double) contarPos,
				(double) sumaNeg / (double) contarNeg);

		scanner.close();
	}

}
