package Ejercicios3_Jasser;
//1. Escribir un programa que encuentre el primer número primo introducido por medio del
//teclado
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        int contador;
        System.out.println("Ingrese un numero:");
        do {
            int numero= entrada.nextInt();
            contador=0;
            for(int i = 1; i <= numero; i++) {
                if((numero % i) == 0) {
                    contador++;
                }
            }
        } while (contador != 2);
        System.out.println("El numero ingresado es primo");
    }
}
