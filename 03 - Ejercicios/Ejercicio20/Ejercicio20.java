import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Suma de dígitos

    int num = 0;
    int resultado = 0;

    System.out.println("Introduce un número para sumar sus dígitos: ");
    num = entrada.nextInt();

    while(num > 0){

        resultado += num % 10;
        num = num/ 10;

    }

    System.out.println("La suma de cada dígito del numero que ingresaste es: "+resultado);

    }
}