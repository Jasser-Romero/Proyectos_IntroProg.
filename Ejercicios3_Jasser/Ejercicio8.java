package Ejercicios3_Jasser;
//8. Realiza un programa que muestre un menú en pantalla con las opciones de calculadora
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String [] args) throws IOException {
        Scanner entrada=new Scanner(System.in);
        int opc, total;
        double total2;
        do {
            System.out.println("CALCULADORA");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("¿Qué elegirá?");
            opc= entrada.nextInt();
            if (opc == 5) {
                System.out.println("Gracias, vuelva pronto");
            } else {
                System.out.println("Por favor ingrese el primer numero");
                int a= entrada.nextInt();
                System.out.println("Por favor ingrese el segundo numero");
                int b= entrada.nextInt();
                switch (opc){
                    case 1:
                        total = a + b;
                        System.out.println("El total de la suma de los operandos es de: " + total);
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();
                        break;
                    case 2:
                        total = a - b;
                        System.out.println("El total de la resta de los operandos es de: " + total);
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();
                        break;
                    case 3:
                        total = a * b;
                        System.out.println("El total de la multiplicacion de los operandos es de: " + total);
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();
                        break;
                    case 4:
                        total2 =(double) a/b;
                        System.out.println("El total de la división de los operandos es de: " + total2);
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();
                        break;
                    default:
                        System.out.println("Opción incorrecta, vuelva a intentarlo");
                }
            }
        } while (opc != 5);
    }
}
