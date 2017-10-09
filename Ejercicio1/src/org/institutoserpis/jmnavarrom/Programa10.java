/*
 * -. Programa que lea tres números enteros H, M, S que contienen hora, minutos
 * y segundos respectivamente, y comprueba si la hora que indican es una hora
 * válida.
 */
package org.institutoserpis.jmnavarrom;

import java.util.Scanner;

public class Programa10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H;
		int M;
		int S;
		
		System.out.println("Introduzca las horas: ");
		H = scanner.nextInt();
		scanner.nextLine();
		
		if (H >= 0 && H <= 23) {
			System.out.println("Introduzca los minutos: ");
			M = scanner.nextInt();
			scanner.nextLine();
			
			if (M >= 0 && M <= 59) {
				System.out.println("Introduzca los segundos: ");
				S = scanner.nextInt();
				scanner.nextLine();
				
				if (S >= 0 && S <= 59) {
					System.out.println("");
				} else {
					System.out.println("El segundo puesto no es válido.");					
				}
			} else {
				System.out.println("El minuto puesto no es válido");
			}
		} else {
			System.out.println("La hora puesta no es válida.");
		}
		scanner.close();
	}
	
}
