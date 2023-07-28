import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        float num_aleatorio = 0;
        int contador = 1;
        float promedio = 0;
        float acumulador = 0;

        
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        float arreglo [] = new float [tamaño];

        for(int i = 0; i < arreglo.length; i++){
            num_aleatorio = (float) (Math.random() * 10);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }


        for(int i = 0; i < arreglo.length; i++){
            
            acumulador = acumulador + arreglo[i];
            promedio = acumulador / tamaño;
            
        }

        System.out.println("Este es el promedio de los números aleatorios");
        System.out.println(promedio);
     
    }
}