package parte1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable que recoge el area de la circunferencia.
		double area;

		// Variable que recoge la langitud de la circunferencia.
		double longitud;

		// Variable que recoge el radio de la circunferencia.
		double radio;

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos el radio al usuario.
		System.out.println("Introduzca el radio de su circunferencia:");

		// Leemos el radio del teclado
		radio = sc.nextDouble();

		// Calculamos la longitud de la circunferencia.
		longitud = 2 * Math.PI * radio;

		// Calculamos el area de la circunferencia.
		area = Math.PI * (radio * radio);

		// Ofrecemos el resultado al usuario.
		System.out.println("Su circunferencia tiene una longutu de " +
		longitud + " metros y un area de " + area + " metros cuadrados.");
		// Cerramos el Scanner.
		sc.close();
	}

}
