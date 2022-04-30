package Ejercicios2_Jasser;
//1. Determina el mayor de 3 números
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el 1er número:");
        int num1= entrada.nextInt();
        System.out.println("Ingrese el 2do número:");
        int num2= entrada.nextInt();
        System.out.println("Ingrese el 3er número:");
        int num3= entrada.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("El número mayor es " + num1);
        } else if (num2>num3) {
            System.out.println("El número mayor es " + num2);
        } else {
            System.out.println("El número mayor es "+num3);
        }
    }
}
