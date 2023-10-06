import java.util.Scanner;
public class Ejercicio07{

    //7. Llenado de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el arreglo lleno con números aleatorios.
    public static void main(String[] args){
        int arreglo [] = new int [10];
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        Ejercicio07.llenarArreglo(arreglo);

        for(int i=0; i<arreglo.length; i++){
           System.out.print("["+arreglo[i]+"]");
        }
        
  
    }

    public int[] llenarArreglo( int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }

    

}