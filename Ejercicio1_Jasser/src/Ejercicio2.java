//2. Formula General
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        double x1, x2, d;
        Scanner num=new Scanner(System.in);
        System.out.println("Ingrese el valor de a:");
        double a=num.nextInt();
        System.out.println("Ingrese el valor de b:");
        double b=num.nextInt();
        System.out.println("Ingrese el valor de c:");
        double c=num.nextInt();
        d=Math.pow(b,2) - 4*a*c;
        if (d<0) {
            System.out.println("El discriminante es negativo por lo que la solución no es real.");
        } else {
            x1= (-b+Math.sqrt(d))/2*a;
            x2= (-b-Math.sqrt(d))/2*a;
            System.out.println("El valor de x1 es: "+x1);
            System.out.println("El valor de x2 es: "+x2);
        }
    }
}
