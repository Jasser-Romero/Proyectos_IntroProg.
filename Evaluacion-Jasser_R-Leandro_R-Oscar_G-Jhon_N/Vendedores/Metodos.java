package Vendedores;
public class Metodos {

    public static int[] salarioVendedores(float[] a, int b) {
        int[] resultado = new int[b];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = (int) ((a[i] * 0.05) + 200);
        }
        return resultado;
    }

    public static void rango(int[] sueldo, int Cant, String[] empleados) {
        for (int i = 0; i < Cant; i++) {
            if (sueldo[i] >= 200 && sueldo[i] <= 299) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 300 && sueldo[i] <= 399) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 400 && sueldo[i] <= 499) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 500 && sueldo[i] <= 599) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 600 && sueldo[i] <= 699) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 700 && sueldo[i] <= 799) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 800 && sueldo[i] <= 899) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 900 && sueldo[i] <= 999) {
                System.out.println(empleados[i] + " recibió un salario");
            } else if (sueldo[i] >= 1000) {
                System.out.println(empleados[i] + " recibió un salario");
            } else {
                System.out.println(empleados[i] + " no recibió un salario");
            }
        }
    }


    public static float []salarioFinal(int[] sueldo, int[] tiempo, int Cant) {
        int cargosMe, cargosMa;
        float []salarioF = new float[Cant];
        for (int i=0;i<sueldo.length;i++){
            salarioF[i]=sueldo[i];
        }
        for (int i = 0; i < sueldo.length; i++) {
            cargosMe = (int) (sueldo[i] * 0.20);
            cargosMa = (int) (sueldo[i] * 0.70);
            if (sueldo[i] <= 450 && tiempo[i] <= 30) {
                System.out.println("No hay cargos hacia el vendedor numero " + (i + 1));
            } else if (sueldo[i] <= 450 && tiempo[i] > 30) {
                System.out.println("El vendedor numero " + (i + 1) + " tiene cargos de $" + cargosMe);
                salarioF[i]-=cargosMe;
            } else if (sueldo[i] > 450 && tiempo[i] <= 20) {
                System.out.println("No hay cargos hacia el vendedor numero " + (i + 1));
            } else {
                System.out.println("El vendedor numero " + (i + 1) + " tiene cargos de $" + cargosMa);
                salarioF[i]-=cargosMa;
            }
        }
        return salarioF;
    }
    public static void sumaTotalSalarios(float[] a){
        int sumaTotal=0;
        for (float j : a) {
            sumaTotal += j;
        }
        System.out.println("La suma total entre los salarios es de $"+sumaTotal);
    }

    public static void promedioSalario(float[] a){
        int sumaTotal=0, cont=0;
        float resultados;
        for (float j : a) {
            sumaTotal += j;
            cont++;
        }
        resultados=sumaTotal/cont;
        System.out.println("El promedio entre los salarios es de $"+resultados);
    }

    public static void salarioMayor(float[] a){
        float mayor, menor;
        mayor = menor = a[0];
        for (float j : a) {
            if (j > mayor) {
                mayor = j;
            }
            if (j < menor) {
                menor = j;
            }
        }
        System.out.println("El salario mayor es $"+mayor);
    }

    public static void salarioMenor(float[] a){
        float mayor, menor;
        mayor = menor = a[0];
        for (float j : a) {
            if (j > mayor) {
                mayor = j;
            }
            if (j < menor) {
                menor = j;
            }
        }
        System.out.println("El salario menor es $"+menor);
    }
}