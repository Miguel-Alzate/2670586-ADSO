import java.util.Scanner;
public class Ejercicio06{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int fb1 = 0;
    int fb2 = 1; 
    int contador = 1;
    int num = 0;
    int fbactual = 0;

    System.out.print("Ingresar la posicion del n-esimo Fibonacci: ");
    num = entrada.nextInt();

    while(contador <=num){
        if(contador > 2){
            fbactual = fb1 + fb2;         
            fb1 = fb2;
            fb2 = fbactual;
        }
        
        contador = contador + 1;
    }

    if(num == 1){
        System.out.println("El n-esimo numero Fibonacci es: 0");
    
    }else if(num == 2){
        System.out.println("El n-esimo numero Fibonacci es: 1");
    }else{
        System.out.print("El n-esimo numero Fibonacci es: "+fbactual);
    }


    }
}
