package parte1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable que almacena el primer numero del usuario.
		double num1;

		// Variable que almacena el segundo numero del usuario.
		double num2;

		// Variable que recoge la suma de los numeros.
		double suma;

		// Variable que recoge la resta de los numeros.
		double resta;

		// Variable que recoge la multiplicacion de los numeros.
		double multiplicacion;

		// Variable que recoge la division de los numeros.
		double division;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario su primer numero.
		System.out.println("Introduzca el primer numero con el que desea operar:");

		// Leemos el numero del teclado.
		num1 = sc.nextDouble();

		// Solicitamos al usuario su segundo numero.
		System.out.println("Introduzca el segundo numero con el que desea operar:");

		// Leemos el numero del teclado.
		num2 = sc.nextDouble();

		// Operacion de la suma.
		suma = num1 + num2;

		// Operacion de la resta.
		resta = num1 - num2;

		// Operacion de la multiplicacion.
		multiplicacion = num1 * num2;

		// Operacion de la division.
		division = num1 / num2;

		// Ofrecemos el resultado al usuario.
		System.out.println("Los resultados de sus operaciones son los siguientes:");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multiplicacion);
		System.out.println("Division: " + division);

		// Cerramos el Scanner.
		sc.close();

	}

}
