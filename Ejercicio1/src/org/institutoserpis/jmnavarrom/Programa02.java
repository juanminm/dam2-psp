/*
 * Programa java que declare cuatro variables enteras A, B, C y D y asígnale un
 * valor acada una. A continuación realiza las instrucciones necesarias para
 * que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome
 * el valor de B.
 */
package org.institutoserpis.jmnavarrom;

public class Programa02 {

	public static void main(String[] args) {
		int A = 29;
		int B = 238;
		int C = 15;
		int D = -187;
		
		int aux;
		
		System.out.printf("A = %d%n", A);
		System.out.printf("B = %d%n", B);
		System.out.printf("C = %d%n", C);
		System.out.printf("D = %d%n", D);
		
		System.out.printf("%nIntercambiando valores...%n%n");
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;

		System.out.printf("A = %d%n", A);
		System.out.printf("B = %d%n", B);
		System.out.printf("C = %d%n", C);
		System.out.printf("D = %d%n", D);
	}

}
