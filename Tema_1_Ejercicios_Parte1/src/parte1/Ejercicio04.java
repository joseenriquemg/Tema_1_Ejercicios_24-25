package parte1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Variable que recoge la primera nota.
		double nota1;
		
		// Variable que recoge la primera nota.
		double nota2;
		
		// Variable que recoge la media de las notas.
		double media;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario su primera nota.
		System.out.println("Introduzca su primera nota:");
		
		// Leemos la nota del teclado.
		nota1 = sc.nextDouble();
		
		// Solicitamos al usuario su segunda nota.
		System.out.println("Introduzca su segunda nota:");
		
		// Leemos la nota del teclado.
		nota2 = sc.nextDouble();
		
		// Calculamos la media.
		media = (nota1 + nota2) / 2;
		
		// Ofrecemos al usurio el resultado.
		System.out.println("Su nota media es " + media);
		
		// Cerramos el Scanner.
		sc.close();
		
	}

}
