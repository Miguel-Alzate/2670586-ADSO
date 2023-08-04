import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner nueva = new Scanner(System.in);

        int bandera1 = 0;
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
        
        System.out.println("Ingresa un nombre para buscarlo");
        nombre = nueva.nextLine();

        for(int i = 0; i < arreglo.length; i++){

            if ( nombre.equalsIgnoreCase( arreglo[i] ) ){
            System.out.println("El nombre "+nombre+" se encuentra en el indice: "+i);
            }else{
                bandera1 = 1;
            } 
        }
        if(bandera1 == 1){
            System.out.println("El nombre "+nombre+" no se encuentra en registrado.");  
            
        }

    }
}