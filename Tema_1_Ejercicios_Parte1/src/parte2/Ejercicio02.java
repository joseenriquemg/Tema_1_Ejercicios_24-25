package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable donde recogeremos el numero.
		int num;

		// Variable que recoge lo que falta para que sea multiplo de 7.
		int restante = 0;

		// Variable que recoge lo que hay que sumarle para que sea multiplo de 7.
		int numeroSumar;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el numero.
		System.out.println("Introduzca un numero:");

		// Leemos el numero del teclado.
		num = sc.nextInt();
		
		// Realizamos las operaciones correspondientes.
		restante = num % 7;
		
		numeroSumar = restante == 0 ? 0 : 7 - restante; 

		// Ofrecemos el resultado al usuario.
		System.out.println("A su numero hay que sumarle " + numeroSumar + " para que sea multiplo de 7.");

		// Cerramos el Scanner
		sc.close();

	}

}
