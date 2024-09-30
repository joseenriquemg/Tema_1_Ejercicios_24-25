package parte2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Variale que recogera los centimetros.
		double centrimetros; 
		
		// Variale que recogera los milimetros.
		double milimetros;
		
		// Milimetros pasados a centrimetros.
		double convertirMilimetros;
		
		// Variale que recogera los metros.
		double metros;
		
		// Milimetros pasados a centrimetros.
		double convertirMetros;
		
		// Variable que recogera la suma.
		double suma;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Solicitamos las medidas al usuario y las leemos del teclado.
		System.out.println("Introduzca los milimetros:");
		milimetros = sc.nextDouble();
		
		System.out.println("Introduzca los centrimetros:");
		centrimetros = sc.nextDouble();
		
		System.out.println("Introduzca los metros:");
		metros = sc.nextDouble();
		
		// Realizamos als operaciones correspondientes.
		convertirMilimetros = milimetros * 10;
		
		convertirMetros = metros / 10;
		
		suma = convertirMilimetros + convertirMetros + centrimetros;
		
		// Ofrecemos el resultado al usuario.
		System.out.println("La suma entre ellos es de " + suma + " centimetros.");
		
		// Cerramos el Scanner.
		sc.close();

	}

}
