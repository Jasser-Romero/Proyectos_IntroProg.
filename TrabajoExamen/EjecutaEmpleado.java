package TrabajoExamen;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String nombre, depart, posicion;
        int horasTrabajo;
        float cuotaHora, sueldoMes;
        String eleccion;

        do {
            System.out.println("------------M E N U-----------");
            System.out.println("Por favor, seleccione el tipo de empleado:");
            System.out.println("1. Empleado por horas");
            System.out.println("2. Empleado asalariado");
            System.out.println("------------/////------------");
            System.out.println("Digite su opcion");
            int opc= entrada.nextInt();

            if(opc==1){
                System.out.println("\tDatos del empleado ");
                System.out.println("Ingrese el nombre del empleado:");
                nombre= entrada.next();
                System.out.println("Ingrese el departamento al que pertenece el empleado:");
                depart= entrada.next();
                System.out.println("Ingrese el puesto del empleado:");
                posicion= entrada.next();

                EmpPorHoras objetoEmpleado = new EmpPorHoras(nombre, depart, posicion);
                System.out.println("¿Cuantas son las horas trabajadas?");
                horasTrabajo= entrada.nextInt();
                System.out.println("¿Cuanto es la cuota por hora?");
                cuotaHora= entrada.nextFloat();

                objetoEmpleado.setHorasTrabajadas(horasTrabajo);
                objetoEmpleado.setCuotaPorHora(cuotaHora);
                objetoEmpleado.calcularSueldoQuincenaHoras(horasTrabajo*cuotaHora);

                System.out.println("\n\tE M P L E A D O");
                System.out.println("Nombre: "+objetoEmpleado.empleado);
                System.out.println("Departamento: "+objetoEmpleado.departamento);
                System.out.println("Puesto: "+objetoEmpleado.empPuesto);
                System.out.println("Sueldo quincenal: "+objetoEmpleado.sueldoQuincenaHoras+"$");
                System.out.println();
            } else if (opc==2){
                System.out.println("\tDatos del empleado ");
                System.out.println("Ingrese el nombre del empleado:");
                nombre= entrada.next();
                System.out.println("Ingrese el departamento al que pertenece el empleado:");
                depart= entrada.next();
                System.out.println("Ingrese el puesto del empleado:");
                posicion= entrada.next();

                EmpAsalariado objetoEmpleado = new EmpAsalariado(nombre, depart, posicion);
                System.out.println("¿Cuanto es el sueldo mensual?");
                sueldoMes= entrada.nextFloat();

                objetoEmpleado.setGananciaMensual(sueldoMes);
                objetoEmpleado.calcularGananciaQuincenal(sueldoMes/2);

                System.out.println("\n\tE M P L E A D O");
                System.out.println("Nombre: "+objetoEmpleado.empleado);
                System.out.println("Departamento: "+objetoEmpleado.departamento);
                System.out.println("Puesto: "+objetoEmpleado.empPuesto);
                System.out.println("Sueldo quincenal: "+objetoEmpleado.GananciaQuincenal()+"$");
                System.out.println();
            } else {
                System.out.println("Eleccion incorrecta, vuelva a intentarlo");
            }
            System.out.println("¿Desea procesar otro empleado? (S/N)");
            eleccion=entrada.next();
        } while (eleccion.equals("S") || eleccion.equals("s"));
        System.out.println("Gracias por utilizar este programa");
    }
}
