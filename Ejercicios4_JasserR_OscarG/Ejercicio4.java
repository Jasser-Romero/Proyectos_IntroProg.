package Ejercicios4_JasserR_OscarG;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Bienvenido:");
        System.out.print("Digite la cantidad de estudiantes:");
        int cant= entrada.nextInt();
        float notaFinal[]=new float[cant];
        String alumnos[]=new String[cant];
        String tabla[]={"Acum IP","Ex IP","Acum IIP","Ex IIP"};
        float notas[][]=new float[cant][4];
        float sumaPromedio=0;
        int cont=0;
        System.out.println("En el siguiente programa se le proporcionara lo siguiente:");
        System.out.println("-Lista de clasificación según las notas");
        System.out.println("-Lista estadística según las cantidades de las notas");
        for (int i=0;i<cant;i++){
            System.out.println("Ingrese el nombre de el estudiante numero "+(i+1)+":");
            alumnos[i]=entrada.next();
        }
        for (int i=0;i< notas.length;i++){
            System.out.println("Digite las notas del estudiante numero "+(i+1)+":");
            for (int j=0;j<notas[0].length;j++){
                System.out.println("Ingrese la nota del "+tabla[j]);
                notas[i][j]= entrada.nextFloat();
                notaFinal[i]+=notas[i][j];
                if (j == 3){
                    System.out.println("La nota final sería de: "+notaFinal[i]);
                }
            }
        }
        System.out.println();
        System.out.println("La lista de las notas con su clasificacion");
        for (int i=0;i<cant;i++){
            if (notaFinal[i]<=100 && notaFinal[i]>=90){
                System.out.println(alumnos[i]+" "+notaFinal[i]+" Sobresaliente");
            } else if (notaFinal[i]<=89 && notaFinal[i]>=80){
                System.out.println(alumnos[i]+" "+notaFinal[i]+" Notable");
            } else if (notaFinal[i]<=79 && notaFinal[i]>=70){
                System.out.println(alumnos[i]+" "+notaFinal[i]+" Buena");
            } else if (notaFinal[i]<=69 && notaFinal[i]>=60){
                System.out.println(alumnos[i]+" "+notaFinal[i]+" Suspenso");
            } else if (notaFinal[i]<=59 && notaFinal[i]>=0){
                System.out.println(alumnos[i]+" "+notaFinal[i]+" Reprobado");
            } else {
                System.out.println("La nota es incorrecta");
            }
        }
        System.out.println();
        for (int i=0;i<cant;i++){
            sumaPromedio += notaFinal[i];
            cont++;
            if (notaFinal[i]>=60){
                System.out.println("El alumno "+alumnos[i]+" ha aprobado");
            } else {
                System.out.println("El alumno "+alumnos[i]+" ha reprobado");
            }
        }
        float notaPromedio= sumaPromedio/cont;
        System.out.println("La nota promedio es de: "+notaPromedio);
    }
}