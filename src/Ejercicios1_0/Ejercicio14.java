
package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int aux=0, num, cont;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número");
		num = leer.nextInt();

		cont=num;
		
		while (cont>0) {
			
			if (num%2==0) {
				aux=aux+num;
				cont=cont-1;
				num=num+2;
			}else {
				num=num+1;
			}
		}
		System.out.println("La suma de los números es: " + aux);
	}

}
