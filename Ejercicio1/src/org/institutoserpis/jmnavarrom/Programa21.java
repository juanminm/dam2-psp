/*
 * -. Contar el número de palabras de una frase.
 */
package org.institutoserpis.jmnavarrom;


import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		String letraAnterior = null;
		String letraActual = null;
		int contarPalabras = 0;

		System.out.print("Escriba una frase: ");
		frase = scanner.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (letraActual != null) {
				letraAnterior = letraActual;
			}

			letraActual = String.valueOf(frase.charAt(i));

			if (letraActual != null && letraAnterior != null
					&& letraActual.matches("[ .,!?]")
					&& letraAnterior.matches("[a-zA-Z0-9ñÑçÇÀ-žΑ-ώД-щ]")) {
				contarPalabras++;
			}
		}
		contarPalabras++;
		
		System.out.println("Número de palabras: " + contarPalabras);
		scanner.close();
	}
}
