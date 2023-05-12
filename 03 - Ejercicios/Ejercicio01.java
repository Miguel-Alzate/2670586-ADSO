import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);   

    int numero_1;
    int numero_2;
    int resultado;

    System.out.println("Ingrese el numero 1: ");
    numero_1 = entrada.nextInt();

    System.out.println("Ingrese el numero 2: ");
    numero_2 = entrada.nextInt();

    resultado = numero_1+numero_2;
    System.out.println("Esta es la suma de los dos numeros: "+resultado);

  }
}