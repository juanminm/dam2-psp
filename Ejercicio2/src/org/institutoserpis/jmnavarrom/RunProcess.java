package org.institutoserpis.jmnavarrom;

import java.io.IOException;
import java.util.Arrays;

public class RunProcess {
	
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar.");
			System.exit(-1);
		}

		ProcessBuilder pb = new ProcessBuilder(args);
		try {
			Process process = pb.start();
			int retorno = process.waitFor();
			System.out.println("La ejecución de " + Arrays.toString(args) +
					" devuelve " + retorno);
		} catch(IOException ex) {
			System.err.println("¡Excepción de E/S!");
			System.exit(-1);
		} catch (InterruptedException e) {
			System.err.print("El proceso hijo finalizó de forma incorrecta");
			System.exit(-1);
		}
	}
}
