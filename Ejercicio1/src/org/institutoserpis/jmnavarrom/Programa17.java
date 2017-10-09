/*
 * -. Pasar de decimal a binario
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Introduzca un número para convertir en binario: ");
		num = scanner.nextInt();
		scanner.nextLine();

		System.out.println(Integer.toBinaryString(num));
		scanner.close();
	}

}
