package parte2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable que recogera el primer numero.
		int numA;

		// Variable que recogera el segundo numero.
		int numB;

		// Variable que recogera el tercer numero.
		int numC;

		// Variable que recoge el valor de X.
		int numX;

		// Vriable que recogera el resultado.
		int resultado;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario las notas de sus tres trimestres.
		System.out.println("Introduzca el valor de A:");
		numA = sc.nextInt();

		System.out.println("Introduzca el valor de B:");
		numB = sc.nextInt();

		System.out.println("Introduzca el valor de C:");
		numC = sc.nextInt();

		System.out.println("Introduzca el valor de X:");
		numX = sc.nextInt();

		// Realizamos las operaciones correspondientes.
		resultado = numA * (numX * numX) + numB * numX + numC;

		// Ofrecemos el resultado al usaurio.
		System.out.println("El resultado de Y es: " + resultado);

		// Cerramos el Scanner.
		sc.close();

	}

}
