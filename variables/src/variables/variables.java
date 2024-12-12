package variables;

import java.util.Scanner;

public class variables {
	// Esto son comentarios en línea :)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Mensaje para el usuario
		System.out.print("Ingrese su nombre: ");

		// Leemos el nombre
		String nom = scanner.next();

		// Mostramos el nombre
		System.out.println("Nombre: " + nom);

		// Mensaje para la edad
		System.out.print("Ingrese su edad: ");
		
		// Leemos la edad
		int edad = scanner.nextInt();

		// Mostramos la edad
		System.out.println("Edad: " + edad);

		// Mensaje para la altura
		System.out.print("Ingrese su altura: ");
		// Leemos la altura
		double altura = scanner.nextDouble();

		// Mostramos la altura
		System.out.println("Altura: " + altura);

		// Mostramos todo junto en un mensaje final
		System.out.println("\nResumen de datos:");
		System.out.println("Nombre: " + nom);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);

		// Cerramos el scanner
		scanner.close();
	}
}
