/*
 * -. Programa que lea un carácter por teclado y compruebe si es una letra
 * mayúscula.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch;

		System.out.print("Escriba un caracter: ");
		ch = scanner.nextLine().charAt(0);

		if (Character.isUpperCase(ch)) {
			System.out.println(ch + " es mayuscula.");
		} else {
			System.out.println(ch + " es minuscula.");
		}

		scanner.close();
	}
}
