package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		double kilosPeras;

		double kilosManzanas;

		double PRECIO_PERAS = 1.95;

		double PRECIO_MANZANAS = 2.35;

		double precioPeras;

		double precioManzanas;

		double precioTotal;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario la cantidad de peras.
		System.out.println("Introduzca los kilos de peras que desea comprar:");

		// Leemos el teclado.
		kilosPeras = sc.nextInt();

		// Solicitamos al usuario la cantidad de manzanas.
		System.out.println("Introduzca los kilos de manzanas que desea comprar:");

		// Leemos el teclado.
		kilosManzanas = sc.nextInt();

		// Calculamos el precio total de las peras.
		precioPeras = PRECIO_PERAS * kilosPeras;

		// Calculamos el precio total de las manzanas.
		precioManzanas = PRECIO_MANZANAS * kilosManzanas;

		// Calculamos el precio total de todo.
		precioTotal = precioPeras + precioManzanas;

		// Ofrecemos el resultado a el usuario.
		System.out.println("Precio total de sus peras: " + precioPeras + " euros.");
		System.out.println("Precio total de sus manzanas: " + precioManzanas + " euros.");
		System.out.println("Precio total a pagar: " + precioTotal + " euros.");

		// Cerramos el Scanner.
		sc.close();

	}

}
