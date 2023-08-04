import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner nueva = new Scanner(System.in);

        String nombre;
        int tamaño = 0;
        String datos;

    
  
        System.out.print("Ingresa el tamaño del arreglo ");
        tamaño = teclado.nextInt();

        String arreglo [] = new String [tamaño];
        System.out.println("Llena el arreglo con datos String");

        for(int i = 0; i < tamaño; i++){
            datos = nueva.nextLine();
            arreglo[i] = datos;
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Arreglo: "+arreglo[i]);
        }
        
     
    }
}
