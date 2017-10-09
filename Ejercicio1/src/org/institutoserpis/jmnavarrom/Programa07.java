/*
 * -. Programa Java que lea un número entero y calcule si es par o impar. 
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.print("Introduzca un número: ");
		num = scanner.nextInt();
		scanner.nextLine();
		
		if (num % 2 == 0) {
			System.out.printf("%d es par.%n", num);
		} else {
			System.out.printf("%d es impar.%n", num);
		}
		
		scanner.close();
	}

}
