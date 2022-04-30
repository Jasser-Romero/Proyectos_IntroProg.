//9. Se debe desarrollar un programa que pida el ingreso del nombre de un artículo, su precio
//y la cantidad que lleva el cliente. Agrega el impuesto. Mostrar el total del comprador.
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[]args){
        double subTotal, TotalAPagar, Impuesto;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=entrada.nextLine();
        System.out.println("Escriba el nombre del producto");
        String producto= entrada.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio= entrada.nextDouble();
        System.out.println("Ingrese la cantidad que lleva");
        int cant= entrada.nextInt();
        subTotal=precio*cant;
        Impuesto=subTotal*0.15;
        TotalAPagar=subTotal+Impuesto;
        System.out.println("El cliente "+nombre+" debe pagar por "+producto+" un total de "+TotalAPagar+"$ con impuesto incluido");
    }
}
