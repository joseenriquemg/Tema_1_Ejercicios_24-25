package parte2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		double num;

		int numeroRedondeado;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el numero.
		System.out.println("Introduzca un numero:");

		// Leemos el numero del teclado.
		num = sc.nextDouble();

		// Realizamos las operaciones correspondientes.
		numeroRedondeado = (int) (num + 0.5);
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su numero redondeado es: " + numeroRedondeado);

		// Cerramos el Scanner
		sc.close();

	}

}
