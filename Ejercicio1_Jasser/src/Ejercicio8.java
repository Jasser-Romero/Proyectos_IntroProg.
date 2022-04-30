//8. Dado un tiempo en minutos, calcular los días, horas y minutos que le corresponden.
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[]Main){
        double horas, dias;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese los minutos que desea calcular");
        double min= entrada.nextDouble();
        horas= min/60;
        dias= horas/24;
        System.out.println("El numero de hora a que equivale es de: "+horas);
        System.out.println("El numero de dias a que equivale es de: "+dias);
    }
}
