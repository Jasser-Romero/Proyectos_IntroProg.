package Ejercicios2_Jasser;
//7. Programa que pida un número entero decimal y muestre un menú donde se pueda
//elegir si se convertirá a binario, octal o hexadecimal.
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero entero decimal:");
        int dec= entrada.nextInt();
        System.out.println("Elija en que desea convertir:");
        System.out.println("1. Binario");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        int opc=entrada.nextInt();
        switch (opc){
            case 1 ->{
                String binario = Integer.toBinaryString(dec);
                System.out.println("De decimal a binario es: "+binario);
            }
            case 2 -> {
                String octal = Integer.toOctalString(dec);
                System.out.println("De decimal a octal es: "+octal);
            }
            case 3 -> {
                String hexa= Integer.toHexString(dec);
                System.out.println("De decimal a hexadecimal es: "+hexa);
            }
        }
    }
}
