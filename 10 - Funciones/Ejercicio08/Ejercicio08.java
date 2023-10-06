import java.util.Scanner;
public class Ejercicio08{
    //8. Impresión de un arreglo: Implementa una función que reciba un arreglo de números e imprima en pantalla el contenido del arreglo.

    public static void main(String[] args){

        int arreglo [] = new int [10];
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        for(int i=0; i<arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }

        imprimirArreglo(arreglo);
        
  
    }
    


    public static void imprimirArreglo(int [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }


}