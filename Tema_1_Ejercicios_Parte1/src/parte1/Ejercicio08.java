package parte1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Variableque recogera el nombre del usuario.
		String nombre;
		
		// Variable que recoge la edada del usuario.
		int edad;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario su nombre.
		System.out.println("Introduzca su nombre:");
		
		// Leemos del teclado.
		nombre = sc.nextLine();
		
		// Solicitamos al usuario su edad.
		System.out.println("Introduzca su edad:");
		
		// Leemos del teclado.
		edad = sc.nextInt();
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el Scanner.
		sc.close();

	}

}
