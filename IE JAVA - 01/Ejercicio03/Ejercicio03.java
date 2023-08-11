import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int num_aleatorio = 0;
        int num_aleatorio2 = 0;
        int n = 0;
        int num_bombas = 0;
        int bombas = 2;
  
        System.out.print("Ingresa el tamaño del arreglo: ");
        n = teclado.nextInt();

        System.out.print("Ingresa la cantidad de 'bombas': ");
        num_bombas = teclado.nextInt();


        int arreglo [] = new int [n];

        for(int i = 0; i < num_bombas; i++){
           num_aleatorio = (int) Math.floor(Math.random() * (n-1) + 1);
           arreglo[num_aleatorio] = 2;
        }

    //xd
        

        System.out.print("Arreglo y sus bombas: ");
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        
        }


     
    }
}