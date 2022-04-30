//4. Calcula la superficie de un triángulo.
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor, ingrese la base del triangulo:");
        float base= entrada.nextFloat();
        System.out.println("Por favor, ingrese la altura del triangulo:");
        float altura= entrada.nextFloat();
        float respuesta;
        respuesta= (base*altura)/2;
        System.out.println("La superficie del triangulo es de: "+respuesta);
    }
}
