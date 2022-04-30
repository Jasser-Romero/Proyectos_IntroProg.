package Ejercicios4_JasserR_OscarG;
//6. Se desea obtener la tarifa de alojamiento por noche de una habitación de un hotel para una persona
//de acuerdo al siguiente catálogo de precios:
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float precios[][]={{253.00f,366.00f,568.00f,852.00f},{368.00f,533.00f,827.00f,1240.00f},{489.00f,709.00f,1099.00f,1648.00f}
        ,{685.00f,993.00f,1539.00f,2309.00f},{798.00f,1157.00f,1793.00f,2690.00f},{1145.00f,1660.00f,2573.00f,3860.00f}};
        String habitaciones[]={"Categoría","Sencilla","Doble","Triple","Suite"};
        int categorias[]={1,2,3,4,5,6};
        System.out.println("De acuerdo al siguiente catalogo seleccione la categoria y habitacion que desea:");
        System.out.println(habitaciones[0]+"  |  "+habitaciones[1]+"        |     "+habitaciones[2]+"       |  "+habitaciones[3]+"        |     "+habitaciones[4]);
        for (int i=0;i<6;i++){
            System.out.println("   "+categorias[i]+"       |     "+precios[i][0]+"$        |    "+precios[i][1]+"$        |      "+precios[i][2]+"$      |    "+precios[i][3]+"$");
        }
        System.out.print("Selecciona la categoria:");
        int opc= entrada.nextInt();
        System.out.print("Seleccione el tipo de habitacion que desea:");
        String tipoHabitacion= entrada.next();
        switch (opc){
            case 1:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 253.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 366.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 568.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 852.00$");
                }
                break;
            case 2:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 368.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 533.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 827.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1240.00$");
                }
                break;
            case 3:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 489.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 709.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1099.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1648.00$");
                }
                break;
            case 4:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 685.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 993.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1539.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 2309.00$");
                }
                break;
            case 5:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 798.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1157.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1793.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 2690.00$");
                }
                break;
            case 6:
                if (tipoHabitacion.equals("Sencilla")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1145.00$");
                } else if (tipoHabitacion.equals("Doble")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 1660.00$");
                } else if (tipoHabitacion.equals("Triple")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 2573.00$");
                } else if (tipoHabitacion.equals("Suite")) {
                    System.out.println("El precio de la habitacion segun su eleccion es de 3860.00$");
                }
                break;
        }
    }
}