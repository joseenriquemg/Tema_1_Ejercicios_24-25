package parte1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable que recoge el año actual.
		int anioActual;

		// Variable que erecoge el año de nacimiento.
		int anioNacimiento;

		// Variable que recoge la edad del usuario.
		int edad;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el año actual.
		System.out.println("Indique el año actual:");

		// Leemos el numero del teclado
		anioActual = sc.nextInt();

		// Solicitamos al usuario el año de nacimiento.
		System.out.println("Indique su año de nacimiento:");

		// Leemos el numero del teclado
		anioNacimiento = sc.nextInt();

		// Calculamos la edad actual.
		edad = anioActual - anioNacimiento;

		// Ofrecemios el resultado al usuario.
		System.out.println("Su edad actual es de " + edad + " años.");

		// Cerramos el Scanner.
		sc.close();

	}

}
