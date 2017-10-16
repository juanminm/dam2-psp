/*
 * -. Calcular la media de una serie de números que se leen por teclado.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int contar = 0;
		int suma = 0;
		boolean esNumero = false;

		do {
			String tmp;
			
			if (esNumero) {
				suma += num;
				contar++;
			}
			
			System.out.print("Introduzca un número (teclee un caracter no"
					+ "numérico o en blanco para parar): ");
			tmp = scanner.nextLine();
			
			if (tmp.matches("-?[0-9]+")) {
				num = Integer.valueOf(tmp);
				esNumero = true;
			} else {
				esNumero = false;
			}

		} while (esNumero);

		System.out.println("La media es: " + (float) suma / (float) contar);
		scanner.close();
	}

}
