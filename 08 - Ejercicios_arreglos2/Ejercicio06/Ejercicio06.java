import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        int num_aleatorio = 0;
        int contador = 1;
        int m = 0;
        int veces = 0;
       

        
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        System.out.println("Ingresa un número entre 1 y 10");
        m = teclado.nextInt();

        int arreglo [] = new int [tamaño];

        for(int i = 0; i < arreglo.length; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 10 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }


       

        for(int i = 0; i < arreglo.length; i++){
            
            if (arreglo[i] == m){
                veces++;
            }
            
        }

        System.out.println("El número M aparecio las siguientes veces: "+veces);

     
    }
}