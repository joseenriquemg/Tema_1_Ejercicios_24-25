package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		// Variable que recoge la cantidad de euros 
		int euros;
		
		// Constante que recoge el valor de un euro a pesetas.
		final int PESETAS = 166;
		
		// Variable que recoge las pesetas que obtenemos.
		int pesetasTotales;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario su edad.
		System.out.println("Introduzca su cantidad de euros y la pasaremos a pesetas:");

		// Leemos el teclado.
		euros = sc.nextInt();

		// Ejecutamos las operaciones.
		pesetasTotales = euros * PESETAS;

		// Ofrecemos el resultado a el usuario.
		System.out.println("Con " + euros + " euros posee usted " + pesetasTotales );

		// Cerramos el Scanner.
		sc.close();

	}
}
