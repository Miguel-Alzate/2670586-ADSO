import java.util.Scanner;
public class Ejercicio10{
    //10. Promedio de un arreglo: Escribe una función que tome un arreglo de números como entrada y devuelva su promedio.

    public static void main(String[] args){

        int arreglo [] = new int [10];
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        for(int i=0; i<arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }

        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");

        promedioArreglo(arreglo);
        
  
    }
    


    public static void promedioArreglo(int [] arreglo){
        float acum = 0;
        for(int i=0; i<arreglo.length; i++){
            acum += arreglo[i];
        }
        System.out.println("Esta es la suma de los números: "+acum);
        acum = acum / 10;
        System.out.println("Este es el promedio del arreglo: "+acum);
    }


}