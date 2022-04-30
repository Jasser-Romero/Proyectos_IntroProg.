package Ejercicios3_Jasser;
//2. Escribir un programa que calcule el factorial de un número introducido por teclado. Imprimir
//la descomposición de la multiplicación.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        int factorial=1,secuencia,i;
        System.out.println("Ingrese el numero que desea calcular el factorial:");
        int fac= entrada.nextInt();
        secuencia=fac;
        for (i=1;i<=fac;i++){
            factorial*=i;
        }
        System.out.println("El factorial del numero es "+factorial);
        System.out.println("La descomposición de la operación es:");
        while(secuencia != 0){
            if (secuencia != 1){
                System.out.printf(" %d x ",secuencia);
            } else {
                System.out.println(secuencia+" ");
            }
            secuencia--;
        }
    }
}
