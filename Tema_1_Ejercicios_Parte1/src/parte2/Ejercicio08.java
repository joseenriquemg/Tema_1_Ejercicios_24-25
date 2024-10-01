package parte2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Variable que recoge la distancia del lanzamiento en metros.
		double lanzamiento;
		
		// Variable que la pasara a centrimetros.
		double convertido;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario los metros de su lanzamiento y leemos del teclado.
		System.out.println("Introduzca el numero de metros que ha recorrido su lanzamiento:");
		lanzamiento = sc.nextDouble();
		
		// Realizamos las operaciones correspondientes.
		convertido = lanzamiento * 100;

		// Ofrecemos el resultado al usuario.
		System.out.println("La distancia final de su lanzamiento en centrimetros es de " 
		+ (int) convertido + " centimetros.");

		// Cerramos el Scanner.
		sc.close();

	}

}
