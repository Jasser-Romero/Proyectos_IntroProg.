//3. Lee el nombre de un empleado e ingresa los sueldos de los primeros 6 sueldos del año.
//Calcula el total semestral y el promedio mensual imprimiendo el nombre del empleado.
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        float valorTotal, promedioSemestral;
        System.out.println("Ingrese el nombre del empleado");
        String nombre=entrada.nextLine();
        System.out.println("Por favor, ingrese los primeros seis sueldos anuales del empleado");
        System.out.println("¿De cuánto es su primer sueldo?");
        float sdo= entrada.nextFloat();
        System.out.println("¿De cuánto es el segundo?");
        float sdo2= entrada.nextFloat();
        System.out.println("¿De cuánto es el tercero?");
        float sdo3= entrada.nextFloat();
        System.out.println("¿De cuánto es el cuarto?");
        float sdo4= entrada.nextFloat();
        System.out.println("¿De cuánto es el quinto?");
        float sdo5= entrada.nextFloat();
        System.out.println("¿De cuánto es el sexto?");
        float sdo6= entrada.nextFloat();
        //El valor de los salarios será en dólares
        System.out.println("Los primeros seis sueldos anuales del empleado "+nombre+" son los siguientes:");
        System.out.printf("1ro: %f $, 2do: %f $, 3ro: %f $, 4to: %f $, 5to: %f $ y 6to: %f $\n",sdo,sdo2,sdo3,sdo4,sdo5,sdo6);
        valorTotal= sdo+sdo2+sdo3+sdo4+sdo5+sdo6;
        System.out.println("El total de la suma de los primeros seis sueldos de "+nombre+": "+valorTotal);
        promedioSemestral= valorTotal/6;
        System.out.println("El promedio semestral de los primeros seis sueldos de "+nombre+"es de: "+promedioSemestral+"$");
    }
}
