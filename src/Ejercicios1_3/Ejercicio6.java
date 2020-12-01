package Ejercicios1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void numrandom(int mNum[][],int filas,int columnas) {
        Random r = new Random();
        for (int i = 0; i < mNum.length; i++) {
            for (int j = 0; j < mNum.length; j++) {
                mNum[i][j] = r.nextInt();
            }



        }
        for (int i = 0; i < mNum.length; i++) {
            for(int j = 0; j < mNum[i].length; j++) {
                System.out.println((mNum[i][j] = r.nextInt(1000)));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leer = new Scanner (System.in);
        int filas=0,columnas=0;

        System.out.println("¿Que tamaño de filas quieres que tenga la matriz?");
        filas = leer.nextInt();
        System.out.println("Que tamaño de columnas quieres que tenga la matriz");
        columnas = leer.nextInt();

        int mNum[][] = new int[filas][columnas];


        numrandom(mNum,filas,columnas);




    }

}