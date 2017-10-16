/*
 * -. Leer N alturas y calcular la altura media. Calcular cuántas hay superiores
 * a la media y cuántas inferiores.
 */
package org.institutoserpis.jmnavarrom;


import java.util.Scanner;

public class Programa20 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float[] altura;
		float alturaSuma = 0;
		float alturaMedia = 0;
		int numAltos = 0;
		int numBajitos = 0;
		
		System.out.print("Introduzca el número de alturas a procesar: ");
		altura = new float[scanner.nextInt()];
		
		for (int i = 0; i < altura.length; i++) {
			System.out.printf("Introduzca la altura nº %d: ", i + 1);
			altura[i] = scanner.nextFloat();
			scanner.nextLine();
			alturaSuma += altura[i];
		}
		
		alturaMedia = alturaSuma / altura.length;
		
		for (int i = 0; i < altura.length; i++) {
			if (alturaMedia < altura[i]) {
				numAltos++;
			} else {
				numBajitos++;
			}
		}
		
		System.out.printf("La media es: %f. El nº de altos es %d y el nº de "
				+ "bajitos es %d.", alturaMedia, numAltos, numBajitos);
		scanner.close();
	}
	
}
