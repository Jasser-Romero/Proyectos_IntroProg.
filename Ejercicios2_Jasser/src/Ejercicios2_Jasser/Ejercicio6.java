package Ejercicios2_Jasser;
//6. Calculadora
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        int total;
        double total2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor ingrese el primer operando:");
        int a= entrada.nextInt();
        System.out.println("Por favor ingrese el segundo operando:");
        int b= entrada.nextInt();
        System.out.println("CALCULADORA");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. RESTO");
        System.out.println("6. POTENCIACION");
        System.out.println("¿Qué elegirá?");
        int opc= entrada.nextInt();
        switch (opc){
            case 1:
                total = a + b;
                System.out.println("El total de la suma de los operandos es de: " + total);
                break;
            case 2:
                total = a - b;
                System.out.println("El total de la resta de los operandos es de: " + total);
                break;
            case 3:
                total = a * b;
                System.out.println("El total de la multiplicacion de los operandos es de: " + total);
                break;
            case 4:
                total2 =(double) a/b;
                System.out.println("El total de la división de los operandos es de: " + total2);
                break;
            case 5:
                total= a%b;
                System.out.println("El total del resto de los operandos es de: "+total);
                break;
            case 6:
                total2= Math.pow(a,b);
                System.out.println("El total de la potenciacion de los operandos es de: "+total2);
                break;
            }
        }
    }
