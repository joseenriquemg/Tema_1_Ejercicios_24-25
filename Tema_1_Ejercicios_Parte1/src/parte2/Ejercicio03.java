package parte2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable donde recogeremos el primer numero.
		int num1;
		
		// Variable donde recogeremos el segundo numero.
		int num2;

		// Variable que recoge lo que falta para que sea multiplo de 7.
		int restante = 0;

		// Variable que recoge lo que hay que sumarle para que sea multiplo de 7.
		int numeroSumar;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el primer numero.
		System.out.println("Introduzca el primer numero:");

		// Leemos el numero del teclado.
		num1 = sc.nextInt();
		
		// Solicitamos al usuario el segundo numero.
		System.out.println("Introduzca el segundo numero:");
		
		// Leemos el numero del teclado.
		num2 = sc.nextInt();

		// Realizamos las operaciones correspondientes.
		restante = num1 % num2;

		numeroSumar = restante == 0 ? 0 : num2 - restante;

		// Ofrecemos el resultado al usuario.
		System.out.println("A " + num1 + " hay que sumarle " + numeroSumar + " para que sea multiplo de " + num2);

		// Cerramos el Scanner
		sc.close();

	}

}
