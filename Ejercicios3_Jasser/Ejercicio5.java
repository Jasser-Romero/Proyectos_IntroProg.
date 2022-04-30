package Ejercicios3_Jasser;
//5. Imprime 5 números aleatorios entre 1 y 100.
public class Ejercicio5 {
    public static void main(String [] args){
        for (int i=1;i<=5;i++){
            System.out.println((int)(Math.random()*100+1));
        }
    }
}
