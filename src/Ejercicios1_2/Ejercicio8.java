package Ejercicios1_2;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int num = 0, contador = 1, max = 0, min = 99999;

		while (contador < 5) {
			Scanner leer = new Scanner(System.in);
			System.out.println("Dime una serie de numeros");
			num = leer.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			contador = contador + 1;
		}
		System.out.println("El minimo es: " + min);
		System.out.println("El maximo es: " + max);
	}

}
