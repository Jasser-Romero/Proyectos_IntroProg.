//10. Al ingresar un número de tres cifras que muestra las unidades, decenas y la centenas.
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero de tres cifras");
        int numero= entrada.nextInt();
        int centena, residuo, unidad, decena;
        centena= numero/100;
        residuo= numero - (centena*100);
        decena= residuo/10;
        unidad= residuo - (decena*10);
        System.out.println("Centena: "+centena);
        System.out.println("Decena: "+decena);
        System.out.println("Unidad: "+unidad);
    }
}
