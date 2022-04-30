package Ejercicios4_JasserR_OscarG;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int matriz[][],numFilas,numColum;
        System.out.println("Ingrese el numero de filas:");
        numFilas=entrada.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        numColum=entrada.nextInt();
        matriz=new int[numFilas][numColum];
        System.out.println("Ingrese los elementos: ");
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<numColum;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nMatriz ingresada: ");
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<numColum;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        int auxiliar;
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<i;j++){
                auxiliar=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=auxiliar;
            }
        }
        int bajoDiagonal=0,sobreDiagonal=0;
        System.out.println("La matriz transpuesta es: ");
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<numColum;j++){
                System.out.print(matriz[i][j]+" ");
                if (i!=j && i>j){
                    bajoDiagonal+=matriz[i][j];
                }
                else if (i!=j && i<j){
                    sobreDiagonal+=matriz[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("La suma sobre la diagonal es de: "+sobreDiagonal);
        System.out.println("La suma bajo la diagonal es de: "+bajoDiagonal);
    }
}
