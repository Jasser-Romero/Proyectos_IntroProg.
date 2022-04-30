package Ejercicios4_JasserR_OscarG;

public class Ejercicio1 {
    public static void main(String[] args) {
        int toneladas[] = {52,34,24,54,81,13,22,45,64,92,41,31};
        float promedio;
        float suma=0;
        for (int i=0;i<=11;i++){
            suma+=toneladas[i];
        }
        promedio=suma/12;
        System.out.println("El resultado del promedio de las toneladas del cereal es de: "+promedio);
        int cant= 0;
        for (int j=0;j<=11;j++){
            if (toneladas[j]>promedio){
                cant++;
            }
        }
        System.out.println("la cantidad de meses con una cosecha superior al promedio son: "+cant);
        int mesMayor = toneladas[0];
        int reconocerMayor=0;
        for (int k=1;k<=11;k++){
            if (mesMayor < toneladas[k]){
                mesMayor= toneladas[k];
                reconocerMayor =k;
            }
        }
        String mes;
        if (reconocerMayor == 0){
            mes= "Enero";
        } else if (reconocerMayor == 1){
            mes= "Febrero";
        } else if (reconocerMayor == 2){
            mes= "Marzo";
        } else if (reconocerMayor == 3){
            mes= "Abril";
        } else if (reconocerMayor == 4){
            mes= "Mayo";
        } else if (reconocerMayor == 5){
            mes= "Junio";
        } else if (reconocerMayor == 6){
            mes= "Julio";
        } else if (reconocerMayor == 7){
            mes= "Agosto";
        } else if (reconocerMayor == 8){
            mes= "Septiembre";
        } else if (reconocerMayor == 9){
            mes= "Octubre";
        } else if (reconocerMayor == 10){
            mes= "Novienbre";
        } else {
            mes= "Diciembre";
        }
        System.out.println("El mes con la mayor produccion de toneladas es: "+mes+" con "+mesMayor+" toneladas");
    }
}
