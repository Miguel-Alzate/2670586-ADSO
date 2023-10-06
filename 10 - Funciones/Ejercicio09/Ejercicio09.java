import java.util.Scanner;
public class Ejercicio09{
    //9. Mínimo de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el valor mínimo.

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

        minimoArreglo(arreglo);
        
  
    }
    


    public static void minimoArreglo(int [] arreglo){
        int menor;
        menor = arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        System.out.println("Este es el minimo del arreglo: "+menor);
    }


}