package parte1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Variable que alamcena el nombre del usuario.
		String nombre = "";
		
		// Variable que recoge la direccion del usuario.
		String direccion = "";
		
		// Variable que recoge el numero de telefono.
		long telefono;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Solicitamos al usuario su nombre.
		System.out.println("Introduzca su nombre:");
		
		// Leemos el dato del teclado.
		nombre = sc.nextLine();
		
		// Solicitamos al usuario su direccion.
		System.out.println("Introduzca su direccion:");
		
		// Leemos el dato del teclado.
		direccion = sc.nextLine();
		
		// Solicitamos al usuario su telefono.
		System.out.println("Introduzca su numero de telefono:");
		
		// Leemos el dato del teclado.
		telefono = sc.nextLong();
		
		// Ofrecemos el resultado al usuario
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Telefono: " + telefono);
		
		// Cerramos el Scanner.
		sc.close();

	}

}
