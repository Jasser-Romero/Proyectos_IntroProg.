package Vendedores;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de vendedores:");
        int Cant=entrada.nextInt();

        String[] Trabajadores=new String[Cant];
        float[] Ganancias=new float[Cant];
        int[] Salario;


        for (int i=0; i<Cant; i++){
            System.out.println("Ingrese nombre del vendedor numero "+(i+1)+" :");
            Trabajadores[i]= entrada.next();
            System.out.println("Ingrese ganancia semanal del vendedor numero "+(i+1)+" :");
            Ganancias[i]= entrada.nextFloat();
        }

        //Calculo del salario de los vendedores
        Salario=Metodos.salarioVendedores(Ganancias,Cant);

        //Determinar quienes recibieron un salario
        Metodos.rango(Salario,Cant,Trabajadores);

        int i;
        int[] Tiempo = new int[ Cant ];
        float[] SalarioF = new float[ Cant ];
        float[] Cargo = new float[ Cant ];

        for (i = 0; i < Tiempo.length; i++) {
            System.out.println("Ingrese el tiempo en minutos en el que se solicita el servicio:");
            Tiempo[ i ] = entrada.nextInt();
        }

        SalarioF=Metodos.salarioFinal(Salario,Tiempo,Cant);

        //Salarios después de restar los cargos
        System.out.println();
        for (i=0;i<Cant;i++){
            System.out.println(Trabajadores[i]+" /// $"+SalarioF[i]);
        }

        System.out.println();

        //Llamados de los metodos
        Metodos.sumaTotalSalarios(SalarioF);
        Metodos.promedioSalario(SalarioF);
        Metodos.salarioMayor(SalarioF);
        Metodos.salarioMenor(SalarioF);
    }
}