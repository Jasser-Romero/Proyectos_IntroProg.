package Ejercicios4_JasserR_OscarG;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int k=0;
        System.out.println("Escriba la cantidad de conductores");
        int personas=entrada.nextInt();
        k=personas+1;
        String nombre[]=new String[k];
        int kilometros[]=new int [k];
        int Suma=0;
        int i=0;
        int j=0;

        for(i=0;i<k;i++){
            System.out.println("Escriba el nombre del conductor");
            String trabajador=entrada.nextLine();
            nombre[i]=trabajador;

        }
        for (i=1;i<k;i++){
            for(j=0;j<k;j++){
                System.out.println("Escriba la distamcia recorrida por: "+nombre[i]+" en el día: "+(j+1));
                int Recorrido=entrada.nextInt();
                Suma+=Recorrido;
                kilometros[i]=Suma;
            }
        }



        for(i=2;i<k;i++){

            System.out.println(nombre[i]+" |");
        }
        System.out.println();

        for (i=1;i<k;i++){

            System.out.print(kilometros[i]+"km |");
        }


    }

}