
package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num1, num2, num3;

		// Pedimos numeros por teclado
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = leer.nextInt();

		System.out.println("Dime un número");
		num2 = leer.nextInt();

		System.out.println("Dime un número");
		num3 = leer.nextInt();
		// fin pedir numeros

		if (num1 < 0) {
			System.out.println("El producto de los tres es " + (num1 * num2 * num3));
		} else {
			System.out.println("La suma de los tres es " + (num1 + num2 + num3));
		}

	}

}
