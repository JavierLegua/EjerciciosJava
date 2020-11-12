import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		int num, suma = 0;

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num = leer.nextInt();

		while (num > 0) {
			suma = num + suma;
			num = num - 1;

		}
		System.out.println(suma);
	}

}
