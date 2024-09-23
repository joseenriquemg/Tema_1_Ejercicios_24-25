package parte1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable que recogera la edad del usuario.
		int edad;
		
		// Variable que recogera la edad que tendra el año q viene.
		int edadProxima;
		
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos al usuario su edad.
		System.out.println("Indique su edad:");
		
		//Leemos la edad del teclado.
		edad = sc.nextInt();
		
		// Operaciones para calcular la edad el año que viene.
		edadProxima = edad + 1;
		
		//Ofrecemos el resultadio al usuario.
		System.out.println("El año que viene usted tendra " + edadProxima + " años.");
		
		//Cerramso el Scanner.
		sc.close();
		
		
		
		
	}

}
