package Ejercicios1_2;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String palabra = "SN", aux;

		Scanner leer = new Scanner(System.in);

		System.out.println("Dime la letra(En mayusculas)");
		aux = leer.next();

		if (aux.equals("S") || (aux.equals("N"))) {
			System.out.println("La letra es correcta");
		} else {
			System.out.println("La letra no es correcta");
		}

	}

}
