package Ejercicios1_2;

public class Ejercicio11 {

	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
	}

}
