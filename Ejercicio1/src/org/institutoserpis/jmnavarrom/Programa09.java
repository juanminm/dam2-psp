/*
 * -. Programa que lea dos números por teclado y muestre el resultado de la
 * división del primero por el segundo. Se debe comprobar que el divisor no
 * puede ser cero. 
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float dividendo;
		float divisor;
		float result;
		
		System.out.print("Introduzca el dividendo: ");
		dividendo = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Introduzca el divisor: ");
		divisor = scanner.nextInt();
		scanner.nextLine();
		
		if (divisor == 0f) {
			System.out.println("El divisor es 0. El resultado es indefinido.");
		} else {
			result = dividendo / divisor;
			System.out.println("El resultado es " + result);
		}
		scanner.close();
	}

}
