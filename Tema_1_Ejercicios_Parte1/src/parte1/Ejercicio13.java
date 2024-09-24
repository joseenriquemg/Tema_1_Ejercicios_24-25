package parte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		// Variable booleana para recoger si puede salir.
		boolean salirCalle = true;
		
		// Variable booleana para recoger si termino las tareas.
		boolean tareasTerminadas;
		
		// Variable booleana para recoger si esta lloviendo.
		boolean hayLLuvia;
		
		// Variable booleana para recoger si va a la biblioteca.
		boolean irBiblioteca;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Preguntamos al usuario y leemos del teclado.
		System.out.println("¿Has terminado las tareas?");
		
		tareasTerminadas = sc.nextBoolean();
		
		System.out.println("¿Esta lloviendo?");
		
		hayLLuvia = sc.nextBoolean();
		
		System.out.println("¿Vas a la biblioteca?");
		
		irBiblioteca = sc.nextBoolean();
		
		// Operaciones para analizar si se puede salir.
		salirCalle = tareasTerminadas && !hayLLuvia || irBiblioteca ;
		
		// Ofrecemos el resultado al usuario.
		System.out.println(salirCalle);
		
		// Cerramos el Scanner.
		sc.close();

	}

}
