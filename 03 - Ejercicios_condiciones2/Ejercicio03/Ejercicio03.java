import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    int num  = 0;

    System.out.print("Ingresa un número para determinar si es par: ");
    num = entrada.nextInt();

    if(num %2 == 0){
        System.out.print("El número ingresado es par");
    }else{
        System.out.print("El número ingresado NO es par");
    }

    }
}
