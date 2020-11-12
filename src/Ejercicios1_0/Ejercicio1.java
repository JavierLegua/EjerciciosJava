package Ejercicios1_0;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos variables
		int num1, num2, AUX;

		// Pedimos numeros por teclado
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = leer.nextInt();

		// Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num2 = leer.nextInt();
		// fin pedir numeros

		System.out.println("El valor de num1 es " + num1 + " y el valor de num 2 es " + num2);

		AUX = num1;
		num1 = num2;
		num2 = AUX;

		System.out.println("El valor de num1 es " + num1 + " y el valor de num 2 es " + num2);

	}

}
