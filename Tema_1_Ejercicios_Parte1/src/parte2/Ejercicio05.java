package parte2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable que recogera los segundos.
		int segundos;

		// Variable que recogera los minutos.
		int minutos;

		// Variable que recogera las horas.
		int horas;
		
		// Variable que recogera los segundos del usuario.
		int segundosTotales;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario el numero de segundos.
		System.out.println("Introduzca el numero de segundos que desea convertir:");
		
		// Leemos el nuemro del teclado.
		segundosTotales = sc.nextInt();
		
		// Realizamos las operaciones correspondientes.
		minutos = segundosTotales / 60;
		
		segundos = segundosTotales % 60;
		
		horas = minutos / 60;
		
		minutos = minutos % 60;
		
		System.out.println("Convertido seria " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		
		
	}

}
