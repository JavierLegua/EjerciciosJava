package Ejercicios1_2;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num = 1, sumapares = 0, sumaimpares = 0;

		while (num < 101) {

			if (num % 2 == 0) {
				sumapares = sumapares + num;
			} else {
				sumaimpares = sumaimpares + num;
			}
			num = num + 1;
		}
		System.out.println("La suma de los números pares es: " + sumapares);
		System.out.println("La suma de los números impares es: " + sumaimpares);
	}
}
