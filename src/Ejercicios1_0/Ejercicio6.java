import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int num;

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num = leer.nextInt();

		if (num < 0) {
			System.out.println("Error");
		} else {
			System.out.println("El cuadrado de " + num + " es " + (Math.pow(num, 2)) + " y su raiz es " + (Math.sqrt(num)));
		}

	}

}
