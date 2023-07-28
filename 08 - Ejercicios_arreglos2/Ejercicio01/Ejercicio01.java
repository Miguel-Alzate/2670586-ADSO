import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        int numeros = 0;
        int suma = 0;
        int num_aleatorio = 0;
        int contador = 1;
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        int arreglo [] = new int [tamaño];

        for(int i = 0; i < tamaño; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 100 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            suma = suma + arreglo[i];
            contador++;
        }

        System.out.println("Esta es la suma de los números aleatorios");
        System.out.println(suma);
     
    }
}