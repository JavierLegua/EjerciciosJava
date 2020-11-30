package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tam=10;
		int vNumeros[]=new int [tam];
		double suma=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime 10 numeros");
		
		for (int i =0;i<vNumeros.length;i++){
			vNumeros[i]=leer.nextInt();
			suma=suma+vNumeros[i];
			
		}
		
		System.out.println("La media de numeros del vector es "+ suma/vNumeros.length);
		
	}

}
