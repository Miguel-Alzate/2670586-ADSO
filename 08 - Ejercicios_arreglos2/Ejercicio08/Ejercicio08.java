import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
       
        int tamaño = 0;
        int num_aleatorio = 0;
        int contador = 1;
        int contador_par = 0;
        int contador_inpar = 0;
        int aux = 0;
        int aux2 = 0;
  
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();
        
        int arreglo [] = new int [tamaño];
       
        for(int i = 0; i < arreglo.length; i++){
            num_aleatorio = (int) Math.floor(Math.random() * 10 + 1);
            arreglo[i] = num_aleatorio; 
            System.out.println("Dato aleatorio 0"+contador+": "+arreglo[i]);
            contador++;
        }

        for(int i = 0; i < arreglo.length; i++){
            
            if(arreglo[i] % 2 == 0){
                contador_par++;
            }else{
                contador_inpar++;
            }
        }

        int arreglo_par [] = new int [contador_par];
        int arreglo_inpar [] = new int [contador_inpar];

        System.out.println("Numeros pares: ");

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] % 2 == 0){
                arreglo_par[aux] = arreglo[i];
                aux++;
               
            }else{
               arreglo_inpar[aux2] = arreglo[i];
               aux2++;
            }
           
        }
        for(int i = 0; i < contador_par; i++){
            System.out.println(arreglo_par[i]);
        }
        System.out.println("Numeros inpares: ");
        for(int i = 0; i < contador_inpar; i++){
            System.out.println(arreglo_inpar[i]);
            
        }













    }
}