package Ejercicios3_Jasser;

import java.util.Scanner;

//3. Programa que recibe como entrada una secuencia de valores numéricos positivos y genere
//como salida la suma de los pares y la multiplicación de los impares. Considere un valor
//negativo como el fin de los datos.
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea:");
        int cant = entrada.nextInt();
        int suma = 0;
        int multiplicacion= 1;
        for (int i = 1; i <= cant; i++){
            System.out.println("Ingrese de numero en numero: ");
            int num = entrada.nextInt();
            if ((num % 2) == 0) {
                suma+=num;
            }else{if ((num % 2) != 0) {
                multiplicacion *= num;

            }
            }}
        System.out.println("La suma de los pares es: " + suma);
        System.out.println("La multiplicación de los impares es: " + multiplicacion);
    }
}
