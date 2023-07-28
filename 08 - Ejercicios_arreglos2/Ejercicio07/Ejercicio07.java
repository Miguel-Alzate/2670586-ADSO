import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        int num_aleatorio = 0;
        int contador = 1;
     
       

        
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        int arreglo [] = new int [tamaño];
        int arreglo2 [] = new int [tamaño];

        for(int i = 0; i < arreglo.length; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 10 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }

        for(int i = 0; i < arreglo.length; i++){
            
            
            
        }

        System.out.println("El número M aparecio las siguientes veces: "+veces);

     
    }
}