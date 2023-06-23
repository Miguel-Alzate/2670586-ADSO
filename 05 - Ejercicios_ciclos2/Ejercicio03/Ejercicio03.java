import java.util.Scanner;
public class Ejercicio03{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int num_aleatorio = 0;
    int contador = 0;
    int i = 0;
    int contador_numero = 1;

    System.out.print("Ingrese numero N: ");
    num = entrada.nextInt();

    while(contador <= num){


        
        
        for(i = 1; contador <= num_aleatorio; i=i+1){
        num_aleatorio = (int) Math.floor(Math.random() * 100 + 1);
       

        if(num_aleatorio % i == 0){
            System.out.println("Primo "+contador_numero+ " Generado -> "+num_aleatorio);
        }
        contador_numero = contador_numero + 1;
       

        
        }
        
    }



    }
}