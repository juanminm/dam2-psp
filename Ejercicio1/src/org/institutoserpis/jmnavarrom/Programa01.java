/*
 * -. Programa java que realice lo siguiente: declarar una variable N de tipo
 * int, una variable A de tipo double y una variable C de tipo char y asigna a
 * cada una un valor. A continuación muestra por pantalla: El valor de cada
 * variable, la suma de N + A, la diferencia de A - N, el valor numérico
 * correspondiente al carácter que contiene la variable C.
 */

package org.institutoserpis.jmnavarrom;

public class Programa01 {

	public static void main(String[] args) {
		int N = 8;
		double A = 4.5;
		char C = 'ñ';

		System.out.println("N = " + N);
		System.out.println("A = " + A);
		System.out.println("C = " + C);
		System.out.println("N + A " + (N + A));
		System.out.println("N - A " + (N - A));
		System.out.println(
				"Valor numerico de C (" + C + "): " + Integer.valueOf(C));
	}

}
