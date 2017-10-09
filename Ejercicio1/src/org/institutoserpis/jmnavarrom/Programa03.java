/*
 * -. Programa Java que lea dos números enteros por teclado y los muestre por
 * pantalla.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduzca el primer numero: ");
		a = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("Introduzca el segundo numero: ");
		b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println();
		System.out.printf("a = %d%nb = %d", a, b);
		scanner.close();
	}
}
