package Ejercicios1_2;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int multiplo, num=3, i=0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime hasta que numero quieres multiplos de 3");
		multiplo = leer.nextInt();
		
		while (i<=multiplo) {
			num=num+1;
			System.out.println(num+num);
			break;
		}
		

	}

}
