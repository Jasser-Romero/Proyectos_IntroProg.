package Ejercicios3_Jasser;
//6. Genera un número aleatorio como booleano mostrando cara (si es verdadero) y cruz (si es
//falso.
import java.util.Random;
public class Ejercicio6 {
    public static void main(String [] args){
        Random lado=new Random();
        boolean moneda=lado.nextBoolean();
        if (moneda==true) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }
    }
}
