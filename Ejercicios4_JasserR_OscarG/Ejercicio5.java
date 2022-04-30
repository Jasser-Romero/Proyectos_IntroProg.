package Ejercicios4_JasserR_OscarG;
import java.util.Scanner;
//Ejercicio#5
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String candidato[]={"   Julio Corea"," Carlos Ríos","Pedro Castillo"};
        String municipio[]={"Managua   ","Granada   ","Chinandega","Matagalpa "};
        int votos[][]={{500,400,300},{250,150,250},{200,250,100},{120,200,210}};
        System.out.println("En la siguiente tabla se demostraran los resultados de las elecciones:");
        System.out.println("                 |  "+candidato[0]+"  |  "+candidato[1]+"   |  "+candidato[2]);
        for (int i=0;i<4;i++){
            System.out.println(municipio[i]+"       |     "+votos[i][0]+"          |    "+votos[i][1]+"          |      "+votos[i][2]);
        }
        int Total=500+250+200+120;
        System.out.println("El ganador de las elecciones es Julio Corea con un total de: "+Total+" votos");
    }
}
