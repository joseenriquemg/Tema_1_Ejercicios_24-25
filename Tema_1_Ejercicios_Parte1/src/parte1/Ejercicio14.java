package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Variable que recogera la nota del primer trismestre.
		int primerTrimestre;
		
		// Variable que recogera la nota del segundo trismestre.
		int segundoTrimestre;
		
		// Variable que recogera la nota del primer trismestre.
		int tercerTrimestre;
		
		// Variable que recogera la nota media mostrada.
		int notaMostrada;
		
		// Variable que recoge la nota del expediente.
		double notaExpediente;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario las notas de sus tres trimestres.
		System.out.println("Introduzca su nota del primer trimestre:");
		primerTrimestre = sc.nextInt();

		System.out.println("Introduzca su nota del segundo trimestre:");
		segundoTrimestre = sc.nextInt();

		System.out.println("Introduzca su nota del tercer trimestre:");
		tercerTrimestre = sc.nextInt();
		
		// Realizamos las operaciones correspondientes de la media.
		notaMostrada = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;

		notaExpediente = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3.0;
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su calificacion es: " + notaMostrada);
		System.out.println("Su nota en el esxpediente es: " + notaExpediente);

		// Cerramos el Scanner.
		sc.close();

	}

}
