package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		String nombre, aux;
		int cont = 0;

		System.out.println("Escribe tu nombre");
		nombre = leer.nextLine();

		for (int i = 0; i < nombre.length(); i++) {
			aux = nombre.substring(i, i + 1);
			if (aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("i") || aux.equalsIgnoreCase("e")
					|| aux.equalsIgnoreCase("o") || aux.equalsIgnoreCase("u")) {
				cont = cont + 1;
			}
		}

		System.out.println("El número de vocales en " + nombre + " es: " + cont);

	}

}
