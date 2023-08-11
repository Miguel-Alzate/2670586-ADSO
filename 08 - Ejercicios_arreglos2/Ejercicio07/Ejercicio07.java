import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //hola
        int tamaño = 0;
        int num_aleatorio = 0;
        int contador = 1;
        int xd = 0;
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();
        xd = tamaño - 1;

        int arreglo [] = new int [tamaño];
        int arreglo2 [] = new int [tamaño];

        for(int i = 0; i < arreglo.length; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 10 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }

        for(int i = 0; i < arreglo.length; i++){
            arreglo2[i] = arreglo[xd];
            xd--;
            
        }

        System.out.print("Arreglo original: ");
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        
        }

        System.out.println("");
        System.out.print("Arreglo inverso: ");

        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo2[i]);
        
        }
            
    }
}