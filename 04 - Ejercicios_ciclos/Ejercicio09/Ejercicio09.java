import java.util.Scanner;
public class Ejercicio09{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int divisores = 0;
    int i = 0;
    System.out.print("Ingresa un número: ");
    num = entrada.nextInt();

    for(i=1; i<=num; i++){
        if(num % i == 0){
            divisores = divisores + 1;
        }
    }

    if(divisores == 2){
        System.out.println("El número que ingresaste es primo");
    }else{
        System.out.println("El número que ingresaste no es primo");
    }








    }
}