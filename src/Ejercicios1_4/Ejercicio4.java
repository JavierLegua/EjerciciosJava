package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		String nombre, aux, vocal="aeiou", vocalaux,resultado;
		int cont = 0;

		System.out.println("Escribe tu nombre");
		nombre = leer.nextLine();
		
		for (int i = 0; i < vocal.length(); i++) {
            vocalaux = (vocal.substring(i, i+1));

            for (int j = 0; j < nombre.length(); j++) {
                aux = (nombre.substring(j, j+1));

                if(aux.equalsIgnoreCase(vocalaux)) {

                    resultado = aux;
                    j=nombre.length();
                    System.out.print(resultado);
                    }
            }
		}
	}
}
