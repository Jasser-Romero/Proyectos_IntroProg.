package Ejercicios2_Jasser;
//8. Lee 5 números y devuelve los mismos 5 números en orden inverso
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese 5 numeros en el orden que guste:");
        int num= entrada.nextInt();
        int num2= entrada.nextInt();
        int num3= entrada.nextInt();
        int num4= entrada.nextInt();
        int num5= entrada.nextInt();
        System.out.println("El orden invertido de los números es:");
        System.out.println(num5+" "+num4+" "+num3+" "+num2+" "+num);
    }
}
