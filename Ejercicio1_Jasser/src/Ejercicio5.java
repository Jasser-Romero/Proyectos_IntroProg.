//5. Al recibir como datos los 3 lados de un triángulo calcula su área.
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        double perimetro, s, area, coeficiente;
        //s es el semi perimetro
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo:");
        double lado= entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo:");
        double lado2= entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo:");
        double lado3= entrada.nextDouble();
        perimetro= lado+lado2+lado3;
        s= perimetro/2;
        coeficiente= s*(s-lado)*(s-lado2)*(s-lado3);
        area=Math.sqrt(coeficiente);
        System.out.println("El area del triangulo es de: "+area);
    }
}
