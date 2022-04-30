package Ejercicios3_Jasser;
//4. Programa que lea 3 números y los ordene según la opción de un menú, en orden ascendente
//o descendente
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el 1er numero:");
        int num1= entrada.nextInt();
        System.out.println("Ingrese el 2do numero:");
        int num2= entrada.nextInt();
        System.out.println("Ingrese el 3er numero:");
        int num3= entrada.nextInt();
        System.out.println("MENÚ");
        System.out.println("1. DESCENDENTE");
        System.out.println("2. ASCENDENTE");
        System.out.println("Elija el orden que desea:");
        int opc= entrada.nextInt();
        switch (opc) {
            case 1:
                if (num1>num2 && num1>num3 && num2>num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num2>num1 && num2>num3 && num1>num3) {
                    System.out.println(num2 + " " + num1+" " + num3);
                } else if (num3>num1 && num3>num2 && num2>num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else if (num1>num2 && num1>num3 && num3>num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num2>num1 && num2>num3 && num3>num1) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num3>num1 && num3>num2 && num1>num2){
                    System.out.println(num3 + " " + num1 + " " + num2);
                }
                break;
            case 2:
                if (num1>num2 && num1>num3 && num2>num3) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else if (num2>num1 && num2>num3 && num1>num3) {
                    System.out.println(num3 + " " + num1+" " + num2);
                } else if (num3>num1 && num3>num2 && num2>num1) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num1>num2 && num1>num3 && num3>num2) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num2>num1 && num2>num3 && num3>num1) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num3>num1 && num3>num2 && num1>num2){
                    System.out.println(num2 + " " + num1 + " " + num3);
                }
                break;
            default:
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
        }
    }
}
