package parte2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Constante que recoge el precio de la entrada de los menores. 
		final double PRECIO_MENOR = 15.50;
		
		// Constante que recoge el precio de la entrada de los adultos.
		final double PRECIO_ADULTO = 20;
		
		// Variable que recogeras el numero de menores.
		int menores;
		
		// Variable que recogeras el numero de adultos.
		int adultos;
		
		// Variable que recogera el precio.
		double precio;
		
		double precioFinal;
		
		// Variable que recogera el descuento.
		final double DESCUENTO = 0.05;
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario el numero de entradas de cada tipo y leemos del teclado.
		System.out.println("Introduzca el numero de entradas de menores que deseas comprar:");
		menores = sc.nextInt();
		
		System.out.println("Introduzca el numero de entradas de adultos que deseas comprar:");
		adultos = sc.nextInt();
		
		precio = (menores * PRECIO_MENOR) + (adultos * PRECIO_ADULTO);
		
		precioFinal = precio >= 100 ? precio - (precio *DESCUENTO) : precio;
		
		// Ofrecemos el resultado al usuario.
		System.out.println("El precio final de sus entradas es de " + precioFinal + " euros.");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
