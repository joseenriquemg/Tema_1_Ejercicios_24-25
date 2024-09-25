package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		// Constante que recoge el valor del IVA.
		final double IVA = 0.21;

		// Variable que recoge el precio del usuario.
		double precioInicial;

		// Variable que recoge el aumento con el IVA.
		double aumentoIva;

		// Variable que recoge el precio con el IVA aplicado.
		double precioFinal;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos su precio al usuario.
		System.out.println("Introduzca su precio inicial:");

		// Leemos del teclado.
		precioInicial = sc.nextDouble();

		// Realizamos las operaciones correspondientes.
		aumentoIva = precioInicial * IVA;

		precioFinal = precioInicial + aumentoIva;

		// Ofrecemos el resultado al usuario.
		System.out.println("Su precio con el IVA aplicado es: " + precioFinal + " euros. ");

		// Cerramos el Scanner.
		sc.close();

	}

}
