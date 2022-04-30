package Ejercicios2_Jasser;
//2. Programa que pida que se introduzca una calificación y que dependiendo de los
//rangos envíe un mensaje.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su calificación de 0 a 100:");
        int calif= entrada.nextInt();
        if (calif>=0 && calif<=59) {
            System.out.println("Reprobado");
        } else if (calif>=60 && calif<=69) {
            System.out.println("Regular");
        } else if (calif>=70 && calif<=79) {
            System.out.println("Bueno");
        } else if (calif>=80 && calif<=89) {
            System.out.println("Muy bueno");
        } else if (calif>=90 && calif<=100) {
            System.out.println("Excelente");
        }
    }
}
