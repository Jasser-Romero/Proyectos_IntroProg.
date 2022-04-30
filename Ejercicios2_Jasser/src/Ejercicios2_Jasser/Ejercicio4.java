package Ejercicios2_Jasser;
//4. Determinar el descuento proporcionado por una tienda a sus clientes.
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        double total, descuento;
        System.out.println("Por favor, ingrese el monto total de las compras:");
        double monto= entrada.nextDouble();
        if (monto<450) {
            System.out.println("Su precio se encuentra en el rango de categoria 1 por lo que no se aplicara algún descuento");
        } else if (monto>=450 && monto<=800) {
            System.out.println("Su precio se encuentra en el rango de categoria 2 por lo que se aplicara un 10% de descuento");
            descuento = monto * 0.1;
            total = monto-descuento;
            System.out.println("El monto total de su compra sin descuento sería de " + monto + " C$");
            System.out.println("El monto total de su compra con descuento aplicado de categoria 2 es de " + total + " C$");
        } else if (monto>800) {
            System.out.println("Su precio se encuentra en el rango de categoria 3 por lo que se aplicara un 20% de descuento");
            descuento = monto * 0.2;
            total= monto-descuento;
            System.out.println("El monto total de su compra sin descuento sería de "+monto+" C$");
            System.out.println("El monto total de su compra con descuento aplicado de categoria 3 es de "+total+" C$");
        }
    }
}
