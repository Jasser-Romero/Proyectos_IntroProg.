package Ejercicios2_Jasser;
//5. Pide un número por teclado e indica si es un número primo o no
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int cdor,i;
        System.out.println("Por favor, ingrese el numero que desea verificar: ");
        int numero = entrada.nextInt();
        cdor = 0;
        for(i = 1; i <= numero; i++) {
            if((numero % i) == 0) {
                cdor++;
            }
        }
        if(cdor <= 2 && numero>1) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
