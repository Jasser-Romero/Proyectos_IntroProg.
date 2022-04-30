package Ejercicios2_Jasser;
//10. Se pide el nombre del empleado, turno que pertenece(mañana, tarde, noche), área
//y salario. Si pertenece al turno de la mañana, es del área de producción y su salario
//no supera los 10,000 será promovido.
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escriba el nombre del empleado: ");
        String nombre=entrada.nextLine();
        System.out.println("Escriba el salario del empleado: ");
        int salario=entrada.nextInt();
        System.out.println("Escriba a que area pertenece: ");
        String area=entrada.nextLine();
        area=entrada.nextLine();
        System.out.println("Seleccione el turno al que pertenece el empleado: ");
        System.out.println("1. Mañana");
        System.out.println("2. Tarde");
        System.out.println("3. Noche");
        int opc=entrada.nextInt();
        switch (opc){
            case 1 -> {
                if (area.equals("Producción") && salario<10000) {
                    System.out.println("Felicidades "+nombre+" usted será promovido");
                } else {
                    System.out.println("El empleado "+nombre+" pertenece al area de "+area+" con un salario de "+salario+" C$");
                }
            }
            case 2 -> {
                System.out.println("El empleado "+nombre+" pertenece al area de "+area+" con un salario de "+salario+" C$");
            }
            case 3 -> {
                System.out.println("El empleado "+nombre+" pertenece al area de "+area+" con un salario de "+salario+" C$");
            }
            default -> {
                System.out.println("Ha elegido una opción incorrecta");
            }
        }
    }
}
