import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    int num = 0;

    System.out.print("Ingresa un número positivo o negativo: ");
    num = entrada.nextInt();

    if (num >0){
        System.out.println("El número que ingresaste es positivo");

    }
    if (num <0){
        System.out.println("El número que ingresaste es negativo");

    }
    if (num == 0){
        System.out.println("El número que ingresaste es Cero");
    }




    }
}