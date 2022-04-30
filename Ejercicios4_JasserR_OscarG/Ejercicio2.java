package Ejercicios4_JasserR_OscarG;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite cuantos nombres ingresara: ");
        int cant=entrada.nextInt();
        String vector[]=new String[cant];
        int longitud[]=new int[cant];
        for(int i=0;i<cant;i++){
            System.out.println("Ingrese el nombre: ");
            vector[i]=entrada.next();
        }
        for(int j=0;j<cant;j++){
            longitud[j]=vector[j].length();
        }
        System.out.println();
        for(int a=0;a<cant;a++){
            System.out.println(vector[a]+" - "+longitud[a]);
        }
    }
}
