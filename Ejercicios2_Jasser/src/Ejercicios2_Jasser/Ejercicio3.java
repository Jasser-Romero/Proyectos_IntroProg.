package Ejercicios2_Jasser;
//3. De acuerdo a una edad que se pida considerar la condición de etapa de la persona.
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, ingrese una edad:");
        int edad= entrada.nextInt();
        if (edad<=11) {
            System.out.println("La persona se encuentra en su etapa de niño");
        } else if ( edad>=12 && edad<=15) {
            System.out.println("La persona se encuentra en su etapa adolescente");
        } else if (edad>=16 && edad<=29) {
            System.out.println("La persona se encuentra en su etapa joven");
        } else if (edad>=30 && edad<=59) {
            System.out.println("La persona se encuentra en su etapa adulta");
        } else if (edad>=60){
            System.out.println("La persona se encuentra en su etapa anciana");
        }
    }
}
