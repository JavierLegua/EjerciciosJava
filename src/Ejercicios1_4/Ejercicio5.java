package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String frase = "", frase1 = "";
		int cont = 1;
		System.out.println("Dime una frase");
		frase = leer.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			frase1 = frase.substring(i, i + 1);
			if (frase1.equals(" ")) {
				cont = cont + 1;
			}
		}
		System.out.println(cont);
	}

}
