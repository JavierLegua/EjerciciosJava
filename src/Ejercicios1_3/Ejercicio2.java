package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static int calcularMedia(int vNumeros[],int tam,double suma) {
		int media=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime 10 numeros");
		for (int i =0;i<vNumeros.length;i++){
			vNumeros[i]=leer.nextInt();
			suma=suma+vNumeros[i];
			
		}
		media=(int) (suma/vNumeros.length);
		System.out.println("La media de los numeros es "+media);
		return media;
	}

	public static void main(String[] args) {
		
		int tam=10;
		int vNumeros[]=new int [tam];
		double suma=0;
		
		
		calcularMedia(vNumeros,tam,suma);
		
	}

}
