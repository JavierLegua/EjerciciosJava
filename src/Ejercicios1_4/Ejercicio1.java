package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		String nombre;
		String nombreinvertido = "";

		System.out.println("Escribe tu nombre");
		nombre = leer.nextLine();

		for (int i = nombre.length() - 1; i >= 0; i--) {
			nombreinvertido = nombreinvertido + (nombre.substring(i,i+1));
		}
		System.out.println(nombreinvertido);
	}

}
