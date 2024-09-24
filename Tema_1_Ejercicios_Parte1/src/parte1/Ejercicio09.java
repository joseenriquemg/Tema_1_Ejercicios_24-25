package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Variable booleana que recoge la mayoria de edad.
		boolean mayorEdad = true;
		
		// Variable que recoge la edad del usuario.
		int edad;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario su edad.
		System.out.println("Introduzca su edad y la maquina indicara si eres mayor de edad:");
		
		// Leemos el teclado.
		edad = sc.nextInt();
		
		// Ejecutamos las operaciones.
		mayorEdad = edad >= 18;
		
		// Ofrecemos el resultado a el usuario.
		System.out.println(mayorEdad);
		
		// Cerramos el Scanner.
		sc.close();
		
	}

}
