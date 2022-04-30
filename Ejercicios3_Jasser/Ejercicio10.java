package Ejercicios3_Jasser;
//10. Crea un programa a criterio propio que muestre un menú para elegir y que pregunte si se
//desea terminar y que lea la respuesta S o N.
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        int opc;
        String eleccion;
        System.out.println("BIENVENIDO");
        System.out.println("En este programa convertirá grados Celsius a Fahrenheit o viceversa");
        do {
            System.out.println("¿Qué elegirá?");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            opc=entrada.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese la cantidad de grados Celsius que desea convertir:");
                    double celsius=entrada.nextDouble();
                    double resultadoF=(celsius*9/5)+32;
                    System.out.println("El total es de "+resultadoF+"°F");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de grados Fahrenheit que desea convertir:");
                    double fahrenheit=entrada.nextInt();
                    double resultadoC=(fahrenheit-32)*5/9;
                    System.out.println("El total de la conversión es de "+resultadoC+"°C");
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a intentarlo");
            }
            System.out.println("¿Desea seguir trabajando? (¿S o N?)");
            eleccion= entrada.nextLine();
            eleccion= entrada.nextLine();
        } while (eleccion.equals("S"));
        System.out.println("Gracias por utilizar este programa");
    }
}
