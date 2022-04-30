//1. Promedio de tres numeros
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        float resultado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1=entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2=entrada.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int n3=entrada.nextInt();
        resultado=(float) (n1 + n2 + n3)/3;
        System.out.println("El promedio de los tres numeros es: "+resultado);
    }
}
