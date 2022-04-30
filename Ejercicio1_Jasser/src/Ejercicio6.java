//6. Calcula el área y perímetro de un rectángulo.
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        double perimetro, area;
        System.out.println("Por favor ingrese el largo del rectangulo");
        double largo= entrada.nextDouble();
        System.out.println("Por favor ingrese el ancho del rectangulo");
        double ancho= entrada.nextDouble();
        perimetro= 2*largo + 2*ancho;
        area= largo*ancho;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        System.out.println("El area del rectangulo es: "+area);
    }
}
