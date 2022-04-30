//7. Dada las horas trabajadas de una persona y el valor por hora. Calcular
//su salario e imprimirlo
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        float salario;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombre= entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas= entrada.nextInt();
        System.out.println("Ingrese el valor de hora trabajada");
        float valorHora= entrada.nextFloat();
        salario= horas*valorHora;
        System.out.println("El salario del trabajador "+nombre+" es de "+salario+"$");
    }
}
