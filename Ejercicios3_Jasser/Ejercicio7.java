package Ejercicios3_Jasser;
import java.util.Scanner;
//7. Programa que reciba como dato un entero positivo, escriba los números perfectos que hay
//entre 1 y el número dado. Un número se considera perfecto si la suma de todos sus divisores
//es igual al propio número
public class Ejercicio7 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        int num,num2,i;
        int[] vector;
        vector=new int[10];
        System.out.println("Ingrese un numero entero:");
        num= entrada.nextInt();
        int X = 0;
        for (i=1;i<num;i++){
            if ((num%i)==0){
                vector[X]=i;
                System.out.println(i+" ");
                X++;
            }
        }
        num2=0;
        for (X--;X>=0;X--){
            num2+=vector[X];
        }
        System.out.println("La suma de todos los numeros es: "+num2);
        if (num==num2) {
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }
    }
}
