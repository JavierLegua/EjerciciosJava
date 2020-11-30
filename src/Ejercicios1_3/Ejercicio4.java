package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void juntarVectores(String vNombres[], int vNumeros[], int tam) {
		for (int i = 0;i<vNombres.length;i++) {
			System.out.println(vNombres[i]+" "+vNumeros[i]);
		}
	}
	
	public static void main(String[] args) {

		int tam=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Dime el tamaño de vectores que quieres.");
		tam=leer.nextInt();
		String vNombres[]=new String [tam];
		int vNumeros[]=new int [tam];
		
		System.out.println("Dime los nombres que quieres guardar");
		 
		for (int i =0;i<vNombres.length;i++){
			vNombres[i]=leer.next();
		}
		
		System.out.println("Dime los numeros que quieres guardar(se asignaran los numeros en el orden que se hayan escrito los nombres)");
		 
		for (int i =0;i<vNumeros.length;i++){
			vNumeros[i]=leer.nextInt();
		}
		
		juntarVectores(vNombres, vNumeros, tam);
		
	}

}
