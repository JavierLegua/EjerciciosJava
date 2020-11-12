package Ejercicios1_0;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		int num, num1, num2, num3, num4, suma;

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num = leer.nextInt();
		Scanner leer1 = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = leer.nextInt();
		Scanner leer2 = new Scanner(System.in);
		System.out.println("Dime un número");
		num2 = leer.nextInt();
		Scanner leer3 = new Scanner(System.in);
		System.out.println("Dime un número");
		num3 = leer.nextInt();
		Scanner leer4 = new Scanner(System.in);
		System.out.println("Dime un número");
		num4 = leer.nextInt();

		suma = num + num1 + num2 + num3 + num4;
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("La media de los numeros es: " + suma / 5);
	}

}
