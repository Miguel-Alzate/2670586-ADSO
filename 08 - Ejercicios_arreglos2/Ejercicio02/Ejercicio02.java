import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        int numeros = 0;
        int producto = 0;
        int num_aleatorio = 0;
        int contador = 1;
        int multiplicacion = 1;
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        int arreglo [] = new int [tamaño];

        for(int i = 0; i < tamaño; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 100 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }
        for(int i = 0; i < tamaño; i++){

            multiplicacion = multiplicacion * arreglo[i];
            producto = multiplicacion;
        }

        System.out.println("Este es el producto de los números aleatorios");
        System.out.println(producto);
     
    }j
}