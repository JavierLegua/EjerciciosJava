package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void recorrerMatriz(String mContactos[][], int filas, int columnas) {

		for (int i = 0; i < mContactos.length; i++) {
			for (int j = 0; j < mContactos[i].length; j++) {
				mContactos[i][j] = "";
			}
		}
	}

	public static void guardarContactos(String mContactos[][], int filas, int columnas) {

		recorrerMatriz(mContactos, filas, columnas);
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < mContactos.length; i++) {
			if (mContactos[i][0].equalsIgnoreCase("")) {
				System.out.println("Dime el nombre del contacto que quieres guardar.");
				mContactos[i][0] = leer.next();
				System.out.println("Dime el numero de telefono que quieres guardar.");
				mContactos[i][1] = leer.next();
			}
		}
	}

	public static void mostrarTodos(String mContactos[][], int filas, int columnas) {

		for (int i = 0; i < mContactos.length; i++) {
			System.out.println(mContactos[i][0] + " " + mContactos[i][1]);
		}
	}

	public static void main(String[] args) {

		int filas = 0, columnas = 2;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el numero de filas que quieres que tenga la matriz");
		filas = leer.nextInt();
		String mContactos[][] = new String[filas][columnas];

		guardarContactos(mContactos, filas, columnas);

		mostrarTodos(mContactos, filas, columnas);

	}

}
