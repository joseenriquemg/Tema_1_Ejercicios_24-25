package parte1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Variable donde recogeremos el numero.
		int num;
		
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		//Solicitamos al usuario el numero.
		System.out.println("Introduzca un numero:");
		
		//Leemos el numero del teclado.
		num = sc.nextInt();
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su numero es el " + num + ".");
		
		// Cerramos el Scanner
		sc.close();

	}

}
