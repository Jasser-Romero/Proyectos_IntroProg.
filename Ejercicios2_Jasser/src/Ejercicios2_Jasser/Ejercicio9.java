package Ejercicios2_Jasser;
//9. Pide el nombre del mes y según sea al caso
//muestra la cantidad de días.
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el nombre de un mes:");
        String mes = entrada.nextLine();
        System.out.println("¿El año es bisiesto? (¿si o no?)");
        String opc = entrada.nextLine();
        switch (opc) {
            case "no":
                switch (mes) {
                    case "Enero" -> System.out.println("El mes tiene 31 días");
                    case "Febrero" -> System.out.println("El mes tiene 28 días");
                    case "Marzo" -> System.out.println("El mes tiene 31 días");
                    case "Abril" -> System.out.println("El mes tiene 30 días");
                    case "Mayo" -> System.out.println("El mes tiene 31 días");
                    case "Junio" -> System.out.println("El mes tiene 30 días");
                    case "Julio" -> System.out.println("El mes tiene 31 días");
                    case "Agosto" -> System.out.println("El mes tiene 31 días");
                    case "Septiembre" -> System.out.println("El mes tiene 30 días");
                    case "Octubre" -> System.out.println("El mes tiene 31 días");
                    case "Noviembre" -> System.out.println("El mes tiene 30 días");
                    case "Diciembre" -> System.out.println("El mes tiene 31 días");
                    default -> System.out.println("Dato erroneo, vuelva a intentarlo");
                }
                break;
            case "si":
                switch (mes) {
                    case "Enero" -> System.out.println("El mes tiene 31 días");
                    case "Febrero" -> System.out.println("El mes tiene 29 días");
                    case "Marzo" -> System.out.println("El mes tiene 31 días");
                    case "Abril" -> System.out.println("El mes tiene 30 días");
                    case "Mayo" -> System.out.println("El mes tiene 31 días");
                    case "Junio" -> System.out.println("El mes tiene 30 días");
                    case "Julio" -> System.out.println("El mes tiene 31 días");
                    case "Agosto" -> System.out.println("El mes tiene 31 días");
                    case "Septiembre" -> System.out.println("El mes tiene 30 días");
                    case "Octubre" -> System.out.println("El mes tiene 31 días");
                    case "Noviembre" -> System.out.println("El mes tiene 30 días");
                    case "Diciembre" -> System.out.println("El mes tiene 31 días");
                    default -> System.out.println("Dato erroneo, vuelva a intentarlo");
                }    }
        }
    }
