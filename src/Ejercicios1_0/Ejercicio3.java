import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int num1, num2;

		// Pedimos numeros por teclado
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = leer.nextInt();

		System.out.println("Dime un número");
		num2 = leer.nextInt();
		// fin pedir numeros

		if (num1 < num2) {
			System.out.println("Num1 es menor que num2");
		} else if (num1 > num2) {
			System.out.println("Num1 es mayor que num2");
		} else {
			System.out.println("Los numeros son iguales");
		}

	}

}
