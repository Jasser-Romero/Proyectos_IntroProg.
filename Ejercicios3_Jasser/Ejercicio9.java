package Ejercicios3_Jasser;
//9. Programa que muestre números aleatorios entre 1 y 50 y que se detenga cuando sea 20
public class Ejercicio9 {
    public static void main(String [] args){
        int random;
        do {
            random=(int)(Math.random()*50+1);
            System.out.println(random);
        } while(random != 20);
    }
}
