package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num1, num2;

		// Pedimos numeros por teclado
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = leer.nextInt();

		System.out.println("Dime un número");
		num2 = leer.nextInt();
		// fin pedir numeros

		System.out.println("La suma de los números es " + (num1 + num2));
		System.out.println("La resta de los números es " + (num1 - num2));
		System.out.println("La multiplicación de los números es " + (num1 * num2));
		System.out.println("La división de los números es " + (num1 / num2));
	}

}
