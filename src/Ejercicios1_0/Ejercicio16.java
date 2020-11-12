package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int contador;
		String palabra;
		String clave;
		boolean interruptor;

		palabra = "eureka";
		contador = 0;
		interruptor = false;

		while ((contador < 3) && (interruptor == false)) {
			System.out.println("Dime la clave");
			clave = leer.next();
			if (clave.equalsIgnoreCase(palabra) ) {
				System.out.println("La clave es correcta");
				interruptor = true;
			} else {
				System.out.println("La clave es incorrecta");
				contador ++;
				if (contador==3) {
					System.out.println("Ya no tienes mas intentos");
				}
			}
			
			
		}
		
	}

}
