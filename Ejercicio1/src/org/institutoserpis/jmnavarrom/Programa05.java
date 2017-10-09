/*
 * -. Programa que lea una cantidad de grados centígrados y la pase a grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double C;
		double F;
		
		System.out.print("Introduzca la temperatura (Celcius): ");
		C = scanner.nextDouble();
		scanner.nextLine();
		
		F = 32 + (9* C / 5);
		
		System.out.printf("%fºC equivale a %fºF%n", C , F);
		scanner.close();

	}

}
