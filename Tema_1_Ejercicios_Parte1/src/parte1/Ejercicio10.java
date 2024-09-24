package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Variable que recoge el numero del usuario.
		int num;

		// Variable booleana que recoge si el numero es par.
		boolean esPar = true;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario su edad.
		System.out.println("Introduzca su numero y la maquina indicara si es par o no:");

		// Leemos el teclado.
		num = sc.nextInt();

		// Ejecutamos las operaciones.
		esPar = num % 2 == 0;

		// Ofrecemos el resultado a el usuario.
		System.out.println(esPar);

		// Cerramos el Scanner.
		sc.close();

	}

}
